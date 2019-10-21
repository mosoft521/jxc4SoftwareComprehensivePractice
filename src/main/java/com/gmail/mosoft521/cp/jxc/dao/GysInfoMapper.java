package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.entity.GysInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GysInfoMapper {
    long countByExample(GysInfoExample example);

    int deleteByExample(GysInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GysInfo record);

    int insertSelective(GysInfo record);

    List<GysInfo> selectByExample(GysInfoExample example);

    GysInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GysInfo record, @Param("example") GysInfoExample example);

    int updateByExample(@Param("record") GysInfo record, @Param("example") GysInfoExample example);

    int updateByPrimaryKeySelective(GysInfo record);

    int updateByPrimaryKey(GysInfo record);
}