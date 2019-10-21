package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.Jsr;
import com.gmail.mosoft521.cp.jxc.entity.JsrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface JsrMapper {
    long countByExample(JsrExample example);

    int deleteByExample(JsrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jsr record);

    int insertSelective(Jsr record);

    List<Jsr> selectByExample(JsrExample example);

    Jsr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jsr record, @Param("example") JsrExample example);

    int updateByExample(@Param("record") Jsr record, @Param("example") JsrExample example);

    int updateByPrimaryKeySelective(Jsr record);

    int updateByPrimaryKey(Jsr record);
}