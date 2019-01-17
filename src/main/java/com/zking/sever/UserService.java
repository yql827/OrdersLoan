package com.zking.sever;

import com.zking.dao.TUserDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Service
@RequestMapping("admin")
public interface UserService {

    @RequestMapping("/login")
    public String getAdminLogin(HttpServletRequest request, String userPwd, String userName, String userCode);

}
