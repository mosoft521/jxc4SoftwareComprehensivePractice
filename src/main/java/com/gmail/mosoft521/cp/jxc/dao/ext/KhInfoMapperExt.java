package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.KhInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface KhInfoMapperExt extends KhInfoMapper {
    String selectMaxId();
}
