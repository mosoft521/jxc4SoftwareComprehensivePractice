package com.gmail.mosoft521.cp.jxc.service;

import com.gmail.mosoft521.cp.jxc.entity.Kucun;
import com.gmail.mosoft521.cp.jxc.javaBean.Item;

import java.util.List;

public interface KucunService {
    List<Kucun> getKucunInfos();

    int updateKucunDj(Kucun kucun);

    Kucun getKucun(Item item);
}
