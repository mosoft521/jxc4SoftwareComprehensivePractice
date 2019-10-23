package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.Ruku;
import com.gmail.mosoft521.cp.jxc.entity.RukuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RukuMapper {
    long countByExample(RukuExample example);

    int deleteByExample(RukuExample example);

    int deleteByPrimaryKey(String rkid);

    int insert(Ruku record);

    int insertSelective(Ruku record);

    List<Ruku> selectByExample(RukuExample example);

    Ruku selectByPrimaryKey(String rkid);

    int updateByExampleSelective(@Param("record") Ruku record, @Param("example") RukuExample example);

    int updateByExample(@Param("record") Ruku record, @Param("example") RukuExample example);

    int updateByPrimaryKeySelective(Ruku record);

    int updateByPrimaryKey(Ruku record);
}