package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.entity.SpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpInfoMapper {
    long countByExample(SpInfoExample example);

    int deleteByExample(SpInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(SpInfo record);

    int insertSelective(SpInfo record);

    List<SpInfo> selectByExample(SpInfoExample example);

    SpInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SpInfo record, @Param("example") SpInfoExample example);

    int updateByExample(@Param("record") SpInfo record, @Param("example") SpInfoExample example);

    int updateByPrimaryKeySelective(SpInfo record);

    int updateByPrimaryKey(SpInfo record);
}