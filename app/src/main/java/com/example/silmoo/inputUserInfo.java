package com.example.silmoo;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;

public class inputUserInfo {

    private static String phoneNum;
    //public String phoneNum;

    public inputUserInfo(){}

    public static String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String setPhoneNum) {
        this.phoneNum = setPhoneNum;
    }

    inputUserInfo(String phoneNum){
        this.phoneNum = phoneNum;
    }

}
