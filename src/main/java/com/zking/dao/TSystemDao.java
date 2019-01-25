package com.zking.dao;

import com.zking.pojo.TSystem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface TSystemDao {

    /**
     * 权限管理绑值
     * @param system
     * @return
     */
    @Select({"<script>",
            "select * from t_system",
            "WHERE 1=1",
            "<when test='systemId>0'>",
            "and system_fid=#{systemId}",
            "</when>",
            "and type=1",
//            "<when test='systemName!=null'>",
//            "and system_name like \"%\"#{systemName}\"%\"",
//            "</when>",
            "</script>"})
    public List<TSystem> getAllSystems(TSystem system);


    /**
     * 编辑权限
     * @param list
     * @return
     */
    @Update({"<script>",
            "update t_system set type=",
             "<foreach collection='list' item='item' index='index' separator=' ' open='case system_id' close='end'>",
            "WHEN #{item.systemId} THEN #{item.type}",
            "</foreach>",
            "where system_id in",
            "<foreach collection='list' item='item' index='index' separator=',' open='(' close=')'>",
            "#{item.systemId, jdbcType=BIGINT}",
            "</foreach>",
            "</script>"})
    public  void updateSmallSystems(List<TSystem> list);





}
