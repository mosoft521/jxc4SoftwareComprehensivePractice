package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.SpInfoMapper;
import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpInfoMapperExt extends SpInfoMapper {
    String selectMaxId();
    List<SpInfo> selectExistKucun();
}
