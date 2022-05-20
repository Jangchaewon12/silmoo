package com.example.silmoo;

import com.google.firebase.database.DatabaseReference;

public class inputUserPhoneNum {

    private String phoneNum;

    public inputUserPhoneNum(){}

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    inputUserPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }

}
