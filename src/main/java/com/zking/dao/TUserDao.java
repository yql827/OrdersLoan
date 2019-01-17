package com.zking.dao;

import com.zking.pojo.TEmp;
import com.zking.pojo.TEmpMessage;
import com.zking.pojo.TSystem;
import com.zking.pojo.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


@Mapper
public interface TUserDao {
    /**
     * 根据用户ID获取用户对象
     * @param empNo
     * @return
     */
    @Select("select * from t_emp where emp_no=#{empNo}")
    public TEmp empGetempNo(String empNo);


    /**
     * 获取该用户部门ID
     * @param empId
     * @return
     */
    @Select("select * from t_emp_message where emp_id=#{empId}")
    public List<TEmpMessage> getDeptID(long  empId);

    /**
     * 获取该用户的大权限
     * @param deptId
     * @return
     */
    @Select("select c.dept_name,c.describes,b.system_id,b.shiro_code,b.system_name,b.system_fid from t_dept_system a, t_system b,t_dept c where a.dept_id=#{deptId} and a.system_id=b.system_id and c.dept_id=#{deptId}")
    public List<Map<String,Object>>  getSystemByBigDept(long deptId);


    /**
     * 获取该用户的小权限
     * @param deptId
     * @return
     */
    @Select("select d.dept_name,s.shiro_code,s.system_name,s.system_fid,s.url from t_dept d,t_system s,t_dept_system ds where ds.system_id=s.system_fid and d.dept_id=ds.dept_id and ds.dept_id=#{deptId}")
    public  List<Map<String,Object>> getSystemBySmallDept(long deptId);

    /**
     * 获取所有权限
     * @return
     */
    @Select("select * from t_system")
 public  List<TSystem> getSystemAll();
}
