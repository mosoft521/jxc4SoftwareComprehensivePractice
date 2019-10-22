package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.SellMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface SellMapperExt extends SellMapper {
    String selectMaxId();

    String selectMaxIdLikeRight(String id);
}
