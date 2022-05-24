package com.example.silmoo;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.core.Context;

public class inputUserInfo {

    private String phoneNum;

    public inputUserInfo(){}

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String setPhoneNum) {
        this.phoneNum = setPhoneNum;
    }

    inputUserInfo(String phoneNum){
        this.phoneNum = phoneNum;
    }

}
