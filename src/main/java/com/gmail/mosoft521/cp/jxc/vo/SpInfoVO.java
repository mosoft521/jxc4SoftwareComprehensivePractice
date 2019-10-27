package com.gmail.mosoft521.cp.jxc.vo;

import com.gmail.mosoft521.cp.jxc.entity.SpInfo;

public class SpInfoVO extends SpInfo {
    private String name;

    public SpInfoVO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getSpname();
    }
}
