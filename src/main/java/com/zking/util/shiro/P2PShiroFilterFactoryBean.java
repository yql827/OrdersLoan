package com.zking.util.shiro;

import com.hazelcast.util.CollectionUtil;
import com.zking.dao.TUserDao;
import com.zking.pojo.TSystem;
import org.apache.shiro.config.Ini;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.util.CollectionUtils;
import org.apache.shiro.web.config.IniFilterChainResolverFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P2PShiroFilterFactoryBean extends ShiroFilterFactoryBean {

    public  static String definitions;

    @Resource
    private TUserDao tUserDao;


    @Override
    public void setFilterChainDefinitions(String definitions) {
        P2PShiroFilterFactoryBean.definitions=definitions;
        List<TSystem> systemAll = tUserDao.getSystemAll();

        for (TSystem system : systemAll) {
            if (system.getSystemFid()>0) {
                definitions=definitions+system.getUrl()+"="+"perms["+system.getShiroCode()+"]";
            }
        }
//从配置文加载权限配置
        Ini ini=new Ini();

        ini.load(definitions);
        Ini.Section section=ini.getSection(IniFilterChainResolverFactory.URLS);

        if (CollectionUtils.isEmpty(section)) {
          section=ini.getSection(Ini.DEFAULT_SECTION_NAME);
        }
        //setFilterChainDefinitions(definitions);

        //加入权限集合
        setFilterChainDefinitionMap(section);

    }
}
