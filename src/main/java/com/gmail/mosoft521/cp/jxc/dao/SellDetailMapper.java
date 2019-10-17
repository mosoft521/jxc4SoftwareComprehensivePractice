package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.SellDetail;
import com.gmail.mosoft521.cp.jxc.entity.SellDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellDetailMapper {
    long countByExample(SellDetailExample example);

    int deleteByExample(SellDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellDetail record);

    int insertSelective(SellDetail record);

    List<SellDetail> selectByExample(SellDetailExample example);

    SellDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellDetail record, @Param("example") SellDetailExample example);

    int updateByExample(@Param("record") SellDetail record, @Param("example") SellDetailExample example);

    int updateByPrimaryKeySelective(SellDetail record);

    int updateByPrimaryKey(SellDetail record);
}