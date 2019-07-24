package com.bluohazard.aplikasidoaharianmuslim.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DaftarDzikirPagi {

    @Expose
    @SerializedName("title")
    private String title;

    @Expose
    @SerializedName("instruction")
    private String instruction;

    @Expose
    @SerializedName("arabDesc")
    private String arabDesc;

    @Expose
    @SerializedName("latinDesc")
    private String latinDesc;

    public DaftarDzikirPagi(String title, String instruction, String arabDesc, String latinDesc) {
        this.title = title;
        this.instruction = instruction;
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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
