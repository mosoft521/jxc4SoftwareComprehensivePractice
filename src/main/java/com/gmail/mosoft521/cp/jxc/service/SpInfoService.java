package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;

import java.util.List;

public interface SpInfoService {
    List<SpInfo> getSpInfos();

    SpInfo getSpInfo(Item item);

    List searchInfo(String conName, String conOperation, String content, List list);
}
