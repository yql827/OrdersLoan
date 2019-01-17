package com.zking.sever.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.zking.dao.TUserDao;
import com.zking.pojo.TEmp;
import com.zking.pojo.TEmpMessage;
import com.zking.pojo.TUser;
import com.zking.sever.UserService;
import com.zking.util.SuperMD5;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@Component
public class UserServiceImpl  implements UserService {

    @Resource
    private TUserDao tUserDao;

    @Override
    public String getAdminLogin(HttpServletRequest request, String empPwd, String empNo, String empCode) {
        // 验证验证码
//        String code=request.getParameter("empCode");
//        String sessionCode = request.getSession().getAttribute("code").toString();

//        if (code.equals(sessionCode)) {


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
           List<Map<String, Object>> systemBySmallDept = tUserDao.getSystemBySmallDept(deptID1.get(0).getDeptId());


            request.getSession().setAttribute("systemByDept", systemByBigDept);
            request.getSession().setAttribute("systemBySmallDept",systemBySmallDept);
            return "redirect:/admin/index.jsp";
//        }
//        else {
//            return "redirect:/admin/login.jsp";
//        }
    }
}
