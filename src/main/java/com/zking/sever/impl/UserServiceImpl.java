package com.zking.sever.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zking.dao.TSystemDao;
import com.zking.dao.TUserDao;
import com.zking.pojo.TEmp;
import com.zking.pojo.TEmpMessage;
import com.zking.pojo.TSystem;
import com.zking.pojo.TUser;
import com.zking.sever.UserService;
import com.zking.util.SuperMD5;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;

@Controller
@Component
public class UserServiceImpl  implements UserService {

    @Resource
    private TUserDao tUserDao;
    @Resource
    private TSystemDao tSystemDao;

    /**
     * 后台管理员登录
     * @param request
     * @param empPwd
     * @param empNo
     * @param empCode
     * @return
     */
    @Override
    public String getAdminLogin(HttpServletRequest request, String empPwd, String empNo, String empCode) {
        // 验证验证码
//               String code=request.getParameter("empCode");
//        String sessionCode = request.getSession().getAttribute("code").toString();
//
//        if (code.equals(sessionCode)) {
//

            //获取主体
            Subject subject = SecurityUtils.getSubject();

            //将用户输入的密码进行加密
            Sha256Hash sha256HashempPwd = new Sha256Hash(empPwd, empNo, empNo.length());
            //将用户密码和用户名存储到Token中
            AuthenticationToken token = new UsernamePasswordToken(empNo, sha256HashempPwd.toString());

            //将用户进行登录验证
            try{
                subject.login(token);
            }catch (Exception e){
                e.printStackTrace();
            }


            //获得用户对象
            TEmp emp = (TEmp) subject.getPrincipal();
            List<TEmpMessage> deptID1 = tUserDao.getDeptID(emp.getEmpId());

            List<Map<String, Object>> systemByBigDept = tUserDao.getSystemByBigDept(deptID1.get(0).getDeptId());

        List<Map<String, Object>> headMap = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (Map<String, Object> map : systemByBigDept) {
            if(Integer.parseInt(map.get("system_fid").toString())==0){
                headMap.add(map);
            }else{
                integers.add(Integer.parseInt(map.get("system_fid").toString()));
            }
        }




        Set set = new HashSet(integers);
        List<Map<String, Object>> sys = new ArrayList<>();
        for (Object o : set) {
            //根据集合中的fid去数据库查询该fid对应的主id
            List<Map<String, Object>> sys1 = tUserDao.getSys(Integer.parseInt(o.toString()));
            sys.add(sys1.get(0));
        }
        if(sys.size()>0){
            for (Map<String, Object> sy : sys) {
                headMap.add(sy);
            }
        }



            List<Map<String, Object>> systemBySmallDept = tUserDao.getSystemBySmallDept(deptID1.get(0).getDeptId());
        List<Map<String, Object>> system_fid = new ArrayList<>();
        for (Map<String, Object> objectMap : systemBySmallDept) {
            if(Integer.parseInt(objectMap.get("system_fid").toString())==0){
                List<Map<String, Object>> system_fid1 = tUserDao.getALLsystem(Integer.parseInt(objectMap.get("system_id").toString()));
                if(null != system_fid1 && system_fid1.size()>0){
                    for (Map<String, Object> map : system_fid1) {
                        system_fid.add(map);
                    }
                }
            }
        }

        for (Map<String, Object> map : system_fid) {

            systemBySmallDept.add(map);
        }


            request.getSession().setAttribute("systemByDept", headMap);
            request.getSession().setAttribute("systemBySmallDept",systemBySmallDept);
            return "redirect:/admin/index.jsp";
//        }
//        else {
//            return "redirect:/admin/login.jsp";
//        }
    }

    @Override
    public String  QuerySystems(HttpServletRequest request){


        List<TSystem> allSystems=null;
        TSystem system=null;
        String  type="";
        if (!"".equals(request.getParameter("type"))&&request.getParameter("type")!=null) {
        type=request.getParameter("type");
        }
        String  systemName="";
        if (!"".equals(request.getParameter("systemName"))&&request.getParameter("systemName")!=null) {
            systemName=request.getParameter("systemName");
            system=new TSystem();
            system.setSystemName(systemName);
        }


        System.out.println(system+"================");
        allSystems = tSystemDao.getAllSystems(system);
        System.out.println(allSystems+"???===========");
        if (type.equals("setSystem")) {
            request.setAttribute("setSystem",allSystems);
            return "admin/admin-permission-add";
        }

         request.setAttribute("allSystems",allSystems);
         return "admin/admin-permission";

    }


    /**
     * 权限绑值编辑
     * @param request
     * @return
     */
    @Override
    public String updateSystem(HttpServletRequest request) {
         Integer systemFid=null;
        if (!"".equals(request.getParameter("systemId"))&&request.getParameter("systemId")!=null){
            systemFid=Integer.parseInt(request.getParameter("systemId"));
            List<Map<String, Object>> alLsystem = tUserDao.getALLsystem(systemFid);
            List<Map<String, Object>> mapList = tUserDao.getSys(systemFid);
            for (Map<String, Object> objectMap : alLsystem) {
                for (Map<String, Object> map : mapList) {
                    objectMap.put("headSystem",map.get("system_name"));
                }
            }

            if (alLsystem.size()>0) {
                request.setAttribute("updateSystemlist",alLsystem);
            }
        }


        return "admin/admin-permission-add";
    }

    @Override
    public String updateSmallSystems(HttpServletRequest request) {



        String[] systemId = request.getParameterValues("systemId");
       String[] types = request.getParameterValues("type");
        TSystem tSystem=null;
        List<TSystem> systemList=new ArrayList<>();
        for (int i = 0; i <systemId.length ; i++) {
            tSystem=new TSystem();
            tSystem.setSystemId(Long.parseLong(systemId[i]));
            tSystem.setType(Integer.parseInt(types[i]));
          systemList.add(tSystem);

        }
        tSystemDao.updateSmallSystems(systemList);
         QuerySystems(request);


        return "admin/admin-permission";
    }
}




