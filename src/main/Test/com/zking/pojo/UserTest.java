package com.zking.pojo;

import com.zking.dao.TSystemDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {
    @Resource
    private TSystemDao tSystemDao;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        TSystem tSystem1=new TSystem();
        tSystem1.setSystemId(19);
        tSystem1.setType(1);
        TSystem tSystem2=new TSystem();
        tSystem2.setSystemId(20);
        tSystem2.setType(1);
        TSystem tSystem3=new TSystem();
        tSystem2.setSystemId(21);
        tSystem2.setType(0);

        Map<Integer,Integer> us=new HashMap<>();





    }

    @Test
    public  void test() throws Exception{


    }
}