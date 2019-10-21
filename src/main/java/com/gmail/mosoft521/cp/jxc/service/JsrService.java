package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.Jsr;

import java.util.List;

public interface JsrService {
    List<Jsr> getJsrs();
    int deleteByPrimaryKey(Integer id);
}
