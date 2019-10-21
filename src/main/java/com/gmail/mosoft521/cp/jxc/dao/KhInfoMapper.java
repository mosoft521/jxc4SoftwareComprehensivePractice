package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.KhInfo;
import com.gmail.mosoft521.cp.jxc.entity.KhInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface KhInfoMapper {
    long countByExample(KhInfoExample example);

    int deleteByExample(KhInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(KhInfo record);

    int insertSelective(KhInfo record);

    List<KhInfo> selectByExample(KhInfoExample example);

    KhInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") KhInfo record, @Param("example") KhInfoExample example);

    int updateByExample(@Param("record") KhInfo record, @Param("example") KhInfoExample example);

    int updateByPrimaryKeySelective(KhInfo record);

    int updateByPrimaryKey(KhInfo record);
}