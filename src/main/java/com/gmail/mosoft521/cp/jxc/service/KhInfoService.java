package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.GysInfo;
import com.gmail.mosoft521.cp.jxc.entity.KhInfo;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;

import java.util.List;

public interface KhInfoService {
    List<KhInfo> getKhInfos();

    KhInfo getKhInfo(Item item);

    boolean existByKhname(String name);

    String selectMaxId();

    int addKeHu(KhInfo khInfo);

    int deleteByPrimaryKey(String id);

    int updateKeHu(KhInfo khInfo);
}
