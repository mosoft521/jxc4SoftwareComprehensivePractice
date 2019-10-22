package com.gmail.mosoft521.vo;

import com.gmail.mosoft521.cp.jxc.entity.Sell;
import com.gmail.mosoft521.cp.jxc.entity.SellDetail;

import java.util.List;

public class SellVO extends Sell {

    private List<SellDetail> sellDetailList;

    public SellVO() {
    }

    public List<SellDetail> getSellDetailList() {
        return sellDetailList;
    }

    public void setSellDetailList(List<SellDetail> sellDetailList) {
        this.sellDetailList = sellDetailList;
    }
}
