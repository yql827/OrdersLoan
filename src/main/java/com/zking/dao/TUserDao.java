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
    @Select("select c.dept_name,c.describes,b.system_id,b.shiro_code,b.system_name,b.system_fid from t_dept_system a, t_system b,t_dept c where a.dept_id=#{deptId} and a.system_id=b.system_id and c.dept_id=#{deptId} and b.type=1")
    public List<Map<String,Object>>  getSystemByBigDept(long deptId);


    /**
     * 获取该用户的小权限
     * @param deptId
     * @return
     */
    @Select("select s.* from t_dept_system ds, t_system s where ds.dept_id=#{deptId} and ds.system_id=s.system_id and s.type=1")
    public  List<Map<String,Object>> getSystemBySmallDept(long deptId);

    /**
     * 获取所有权限
     * @return
     */
    @Select("select * from t_system")
 public  List<TSystem> getSystemAll();

    /**
     * 根据权限主ID获取权限
     * @param id
     * @return
     */
    @Select("select * from t_system where system_id=#{id} and type=1")
    public List<Map<String, Object>> getSys(Integer id);

    /**
     * 根据权限fid获取头部下的小权限
     * @param systemFid
     * @return
     */
    @Select("select * from  t_system where system_fid=#{systemFid}")
    public  List<Map<String, Object>> getALLsystem(Integer systemFid);






}
