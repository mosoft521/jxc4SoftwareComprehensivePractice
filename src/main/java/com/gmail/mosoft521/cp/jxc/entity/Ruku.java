package com.gmail.mosoft521.cp.jxc.entity;

import java.util.Date;

public class Ruku {
    private String rkid;

    private Float pzs;

    private String je;

    private String ysjl;

    private String gysname;

    private Date rkdate;

    private String czy;

    private String jsr;

    private String jsfs;

    public String getRkid() {
        return rkid;
    }

    public void setRkid(String rkid) {
        this.rkid = rkid == null ? null : rkid.trim();
    }

    public Float getPzs() {
        return pzs;
    }

    public void setPzs(Float pzs) {
        this.pzs = pzs;
    }

    public String getJe() {
        return je;
    }

    public void setJe(String je) {
        this.je = je == null ? null : je.trim();
    }

    public String getYsjl() {
        return ysjl;
    }

    public void setYsjl(String ysjl) {
        this.ysjl = ysjl == null ? null : ysjl.trim();
    }

    public String getGysname() {
        return gysname;
    }

    public void setGysname(String gysname) {
        this.gysname = gysname == null ? null : gysname.trim();
    }

    public Date getRkdate() {
        return rkdate;
    }

    public void setRkdate(Date rkdate) {
        this.rkdate = rkdate;
    }

    public String getCzy() {
        return czy;
    }

    public void setCzy(String czy) {
        this.czy = czy == null ? null : czy.trim();
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr == null ? null : jsr.trim();
    }

    public String getJsfs() {
        return jsfs;
    }

    public void setJsfs(String jsfs) {
        this.jsfs = jsfs == null ? null : jsfs.trim();
    }
}