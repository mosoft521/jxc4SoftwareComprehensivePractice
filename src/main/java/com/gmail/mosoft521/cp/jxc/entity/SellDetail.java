package com.gmail.mosoft521.cp.jxc.entity;

public class SellDetail {
    private Integer id;

    private String sellid;

    private String spid;

    private Float dj;

    private Float sl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellid() {
        return sellid;
    }

    public void setSellid(String sellid) {
        this.sellid = sellid == null ? null : sellid.trim();
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid == null ? null : spid.trim();
    }

    public Float getDj() {
        return dj;
    }

    public void setDj(Float dj) {
        this.dj = dj;
    }

    public Float getSl() {
        return sl;
    }

    public void setSl(Float sl) {
        this.sl = sl;
    }
}