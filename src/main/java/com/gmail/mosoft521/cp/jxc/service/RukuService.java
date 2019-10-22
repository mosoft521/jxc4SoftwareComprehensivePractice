package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.vo.RukuVO;

import java.util.Date;

/**
 * 入库业务接口
 */
public interface RukuService {
    RukuVO insertRukuInfo(RukuVO rukuVO);

    String selectMaxId();

    String getRuKuMainMaxId(Date date);
}
