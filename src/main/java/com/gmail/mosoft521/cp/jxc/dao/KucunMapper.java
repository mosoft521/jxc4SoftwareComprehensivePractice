package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.Kucun;
import com.gmail.mosoft521.cp.jxc.entity.KucunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KucunMapper {
    long countByExample(KucunExample example);

    int deleteByExample(KucunExample example);

    int deleteByPrimaryKey(String id);

    int insert(Kucun record);

    int insertSelective(Kucun record);

    List<Kucun> selectByExample(KucunExample example);

    Kucun selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Kucun record, @Param("example") KucunExample example);

    int updateByExample(@Param("record") Kucun record, @Param("example") KucunExample example);

    int updateByPrimaryKeySelective(Kucun record);

    int updateByPrimaryKey(Kucun record);
}