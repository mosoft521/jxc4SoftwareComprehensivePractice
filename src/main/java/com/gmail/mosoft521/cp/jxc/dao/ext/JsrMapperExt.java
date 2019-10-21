package com.gmail.mosoft521.cp.jxc.dao.ext;

import com.gmail.mosoft521.cp.jxc.dao.JsrMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface JsrMapperExt extends JsrMapper {
    int reduceEnableByPk(Integer id);
}
