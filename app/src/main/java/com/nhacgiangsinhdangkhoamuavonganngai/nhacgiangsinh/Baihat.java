package com.nhacgiangsinhdangkhoamuavonganngai.nhacgiangsinh;

public class Baihat {
    private String tenbh;
    private String loinhan;
    private int nhac;

    public Baihat(String tenbh, String loinhan, int nhac) {
        this.tenbh = tenbh;
        this.loinhan = loinhan;
        this.nhac = nhac;
    }

    public String getTenbh() {
        return tenbh;
    }

    public void setTenbh(String tenbh) {
        this.tenbh = tenbh;
    }

    public String getLoinhan() {
        return loinhan;
    }

    public void setLoinhan(String loinhan) {
        this.loinhan = loinhan;
    }

    public int getNhac() {
        return nhac;
    }

    public void setNhac(int nhac) {
        this.nhac = nhac;
    }
}
