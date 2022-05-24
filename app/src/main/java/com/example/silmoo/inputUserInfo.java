package com.example.silmoo;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class inputUserInfo {

    public String phoneNum;
    public inputUserInfo(){}
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String setPhoneNum) {
        this.phoneNum = setPhoneNum;
    }
    public inputUserInfo(String phoneNum){
        this.phoneNum = phoneNum;
    }

    @Exclude
    public Map<String, Object> phoneNumToMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("phoneNum", phoneNum);
        return result;
    }
}
