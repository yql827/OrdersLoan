package com.zking.sever;

import com.zking.dao.TUserDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
@RequestMapping("admin")
public interface UserService {

    /**
     * 管理员登录
     * @param request
     * @param userPwd
     * @param userName
     * @param userCode
     * @return
     */
    @RequestMapping("/login")
    public String getAdminLogin(HttpServletRequest request, String userPwd, String userName, String userCode);

    /**
     * 绑权限节点
     * @param request
     * @return
     */
    @RequestMapping("/QuerySystems")
    public  String   QuerySystems(HttpServletRequest request);

    /**
     * 绑值权限编辑
     * @param request
     * @return
     */
    @RequestMapping("/updateSystem")
    public  String updateSystem(HttpServletRequest request);

    /**
     * 权限状态编辑
     * @param request
     * @return
     */
    @RequestMapping("/updateSmallSystems")
    public  String updateSmallSystems(HttpServletRequest request);
}
