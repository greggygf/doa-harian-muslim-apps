package com.bluohazard.aplikasidoaharianmuslim.Model;

public class Daftar {
    private String title;
    private String arabDesc;
    private String latinDesc;

    public Daftar(String title, String arabDesc, String latinDesc) {
        this.title = title;
        this.arabDesc = arabDesc;
        this.latinDesc = latinDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArabDesc() {
        return arabDesc;
    }

    public void setArabDesc(String arabDesc) {
        this.arabDesc = arabDesc;
    }

    public String getLatinDesc() {
        return latinDesc;
    }

    public void setLatinDesc(String latinDesc) {
        this.latinDesc = latinDesc;
    }
}
