package com.gmail.farrasabiyyu12.rumahsakit.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelRumsak {
    @SerializedName("success")
    String success;
    @SerializedName("data")
    Rumsak mRumsak;
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
    public Rumsak getRumsak() {
        return mRumsak;
    }
    public void setKontak(Rumsak rumsak) {
        mRumsak = rumsak;
    }

}