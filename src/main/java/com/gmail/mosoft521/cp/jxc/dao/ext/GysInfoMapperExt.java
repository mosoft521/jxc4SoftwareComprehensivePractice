package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.GysInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface GysInfoMapperExt extends GysInfoMapper {
    String selectMaxId();
}
