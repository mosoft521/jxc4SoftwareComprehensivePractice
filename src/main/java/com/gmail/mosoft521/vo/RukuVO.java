package com.gmail.mosoft521.vo;

import com.gmail.mosoft521.cp.jxc.entity.Ruku;
import com.gmail.mosoft521.cp.jxc.entity.RukuDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RukuVO extends Ruku {
    private List<RukuDetail> detailArrayList = new ArrayList<RukuDetail>();

    public RukuVO() {
    }

    public List<RukuDetail> getDetailArrayList() {
        return detailArrayList;
    }

    public void setDetailArrayList(List<RukuDetail> detailArrayList) {
        this.detailArrayList = detailArrayList;
    }
}
