package com.gmail.mosoft521.cp.jxc.entity;

public class RukuDetail {
    private String id;

    private String rkid;

    private String spid;

    private String dj;

    private Float sl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRkid() {
        return rkid;
    }

    public void setRkid(String rkid) {
        this.rkid = rkid == null ? null : rkid.trim();
    }

    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid == null ? null : spid.trim();
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj == null ? null : dj.trim();
    }

    public Float getSl() {
        return sl;
    }

    public void setSl(Float sl) {
        this.sl = sl;
    }
}