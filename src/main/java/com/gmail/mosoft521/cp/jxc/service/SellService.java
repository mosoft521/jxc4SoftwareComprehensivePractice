package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.vo.SellVO;

import java.util.Date;

public interface SellService {
    boolean insertSellInfo(SellVO sellVO);

    String selectMaxId();

    String getSellMainMaxId(Date date);
}
