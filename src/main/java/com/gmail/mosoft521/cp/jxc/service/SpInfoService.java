package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.SpInfo;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;

import java.util.List;

public interface SpInfoService {
    List<SpInfo> getSpInfos();

    SpInfo getSpInfo(Item item);

    List<SpInfo> searchInfo(String conName, String conOperation, String content, List list);

    boolean existBySpname(String spname);

    String selectMaxId();

    int addSp(SpInfo spInfo);

    int deleteByPk(String id);

    int updateSp(SpInfo spInfo);
}
