package com.gmail.mosoft521.cp.jxc.entity;

public class KhInfo {
    private String id;

    private String khname;

    private String jian;

    private String address;

    private String bianma;

    private String tel;

    private String fax;

    private String lian;

    private String ltel;

    private String mail;

    private String xinhang;

    private String hao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname == null ? null : khname.trim();
    }

    public String getJian() {
        return jian;
    }

    public void setJian(String jian) {
        this.jian = jian == null ? null : jian.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBianma() {
        return bianma;
    }

    public void setBianma(String bianma) {
        this.bianma = bianma == null ? null : bianma.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getLian() {
        return lian;
    }

    public void setLian(String lian) {
        this.lian = lian == null ? null : lian.trim();
    }

    public String getLtel() {
        return ltel;
    }

    public void setLtel(String ltel) {
        this.ltel = ltel == null ? null : ltel.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getXinhang() {
        return xinhang;
    }

    public void setXinhang(String xinhang) {
        this.xinhang = xinhang == null ? null : xinhang.trim();
    }

    public String getHao() {
        return hao;
    }

    public void setHao(String hao) {
        this.hao = hao == null ? null : hao.trim();
    }
}