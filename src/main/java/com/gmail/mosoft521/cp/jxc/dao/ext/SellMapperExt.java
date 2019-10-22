package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.SellMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface SellMapperExt extends SellMapper {
    String selectMaxId();

    String getSellMainMaxId(Date date);
}
