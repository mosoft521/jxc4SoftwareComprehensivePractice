package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;

import java.util.List;

public interface GysInfoService {
    List<GysInfo> getGysInfos();
    GysInfo getGysInfo(Item item);
    boolean existQuanChengF(String quanCheng);
    int addGys(GysInfo gysInfo);
}
