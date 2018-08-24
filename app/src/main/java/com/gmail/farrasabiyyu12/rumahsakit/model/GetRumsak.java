package com.gmail.farrasabiyyu12.rumahsakit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetRumsak {
    @SerializedName("success")
    String success;
    @SerializedName("data")
    List<Rumsak> listDataRumsak;
    @SerializedName("message")
    String message;
    public String getSuccess() {
        return success;
    }
    public void setSuccess(String success) {
        this.success = success;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Rumsak> getListDataRumsak() {
        return listDataRumsak;
    }
    public void setListDataRumsak(List<Rumsak> listDataRumsak) {
        this.listDataRumsak = listDataRumsak;
    }
}