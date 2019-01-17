package com.zking.util.shiro;

import com.zking.dao.TUserDao;
import com.zking.pojo.TEmp;
import com.zking.pojo.TEmpMessage;
import com.zking.pojo.TUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpRequest;
import sun.security.krb5.internal.ccache.CredentialsCache;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class ShiroClass extends AuthorizingRealm {

     @Resource
    private TUserDao tUserDao;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();

        TEmp tEmp =(TEmp) principalCollection.getPrimaryPrincipal();
        List<TEmpMessage> deptID1 = tUserDao.getDeptID(tEmp.getEmpId());


        List<Map<String, Object>> systemByDept = tUserDao.getSystemBySmallDept(deptID1.get(0).getDeptId());
        if (systemByDept.size()>0) {
            for (Map<String, Object> map : systemByDept) {
                info.addStringPermission(map.get("shiro_code").toString());
            }
        }


        return info;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken passwordToken = (UsernamePasswordToken) authenticationToken;
        TEmp emp = tUserDao.empGetempNo(passwordToken.getUsername());
        if(emp==null){
            return null;
        }

        return new SimpleAuthenticationInfo(emp, emp.getEmpPwd(), "");
    }
}
