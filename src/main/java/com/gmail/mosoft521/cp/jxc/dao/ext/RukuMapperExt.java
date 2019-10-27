package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.RukuMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface RukuMapperExt extends RukuMapper {
    String selectMaxId();
}
