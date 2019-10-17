package com.gmail.mosoft521.cp.jxc.entity;

import java.util.Date;

public class Sell {
    private String sellid;

    private Float pzs;

    private String je;

    private String ysjl;

    private String khname;

    private Date xsdate;

    private String czy;

    private String jsr;

    private String jsfs;

    public String getSellid() {
        return sellid;
    }

    public void setSellid(String sellid) {
        this.sellid = sellid == null ? null : sellid.trim();
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

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname == null ? null : khname.trim();
    }

    public Date getXsdate() {
        return xsdate;
    }

    public void setXsdate(Date xsdate) {
        this.xsdate = xsdate;
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