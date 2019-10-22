package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.Sell;
import com.gmail.mosoft521.cp.jxc.entity.SellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellMapper {
    long countByExample(SellExample example);

    int deleteByExample(SellExample example);

    int deleteByPrimaryKey(String sellid);

    int insert(Sell record);

    int insertSelective(Sell record);

    List<Sell> selectByExample(SellExample example);

    Sell selectByPrimaryKey(String sellid);

    int updateByExampleSelective(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByExample(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}