package com.gmail.mosoft521.cp.jxc.entity;

public class Kucun {
    private String id;

    private String spname;

    private String jc;

    private String gg;

    private String bz;

    private String dw;

    private Float dj;

    private Float kcsl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname == null ? null : spname.trim();
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc == null ? null : jc.trim();
    }

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg == null ? null : gg.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw == null ? null : dw.trim();
    }

    public Float getDj() {
        return dj;
    }

    public void setDj(Float dj) {
        this.dj = dj;
    }

    public Float getKcsl() {
        return kcsl;
    }

    public void setKcsl(Float kcsl) {
        this.kcsl = kcsl;
    }
}