package com.gmail.mosoft521.cp.jxc.dao;

import com.gmail.mosoft521.cp.jxc.entity.RukuDetail;
import com.gmail.mosoft521.cp.jxc.entity.RukuDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RukuDetailMapper {
    long countByExample(RukuDetailExample example);

    int deleteByExample(RukuDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(RukuDetail record);

    int insertSelective(RukuDetail record);

    List<RukuDetail> selectByExample(RukuDetailExample example);

    RukuDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RukuDetail record, @Param("example") RukuDetailExample example);

    int updateByExample(@Param("record") RukuDetail record, @Param("example") RukuDetailExample example);

    int updateByPrimaryKeySelective(RukuDetail record);

    int updateByPrimaryKey(RukuDetail record);
}