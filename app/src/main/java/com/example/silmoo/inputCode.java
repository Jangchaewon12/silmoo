package com.example.silmoo;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;

public class inputCode {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();   // 파이어베이스 데이터베이스 연동
    DatabaseReference ref = database.getReference();

    //변수 선언
    private String inputCodeTime;
    private String inputCodeSeat1;
    private String inputCodePerson;

    public inputCode(){}

    //여기서부터 get,set 함수를 사용하는데 이부분을 통해 값을 가져옴
    public String getInputCodeTime() {
        return inputCodeTime;
    }

    public void setInputCodeTime(String inputCodeTime) {this.inputCodeTime = inputCodeTime;}

    public String getInputCodeSeat1() {
        return inputCodeSeat1;
    }

    public void setInputCodeSeat1(String inputCodeSeat) {
        this.inputCodeSeat1 = inputCodeSeat;
    }

    public String getInputCodePerson() {
        return inputCodePerson;
    }

    public void setInputCodePerson(String inputCodePerson) {this.inputCodePerson = inputCodePerson;}


    //이거는 그룹을 생성할때 사용하는 부분
    public inputCode(String inputCodeTime, String inputCodeSeat1, String inputCodePerson) {
        this.inputCodeTime = inputCodeTime;
        this.inputCodeSeat1 = inputCodeSeat1;
        this.inputCodePerson = inputCodePerson;
    }

}
