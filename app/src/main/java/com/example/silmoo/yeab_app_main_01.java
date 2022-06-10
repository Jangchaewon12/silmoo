package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yeab_app_main_01 extends AppCompatActivity {

    // 처움부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Button btn_reservation;
    Button btn_getCode;
    Button btn_mapshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_main_01);

        /*좌석 예약 버튼 누르면 다음 페이지로 전환*/
        btn_reservation = findViewById(R.id.btn_reservation);
        btn_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_main_01.this, yeab_app_reserve_01.class);
                /*Intent: this 현재 클래스에서 ,(콤마) 뒤에 적힌 클래스로 이동해라*/
                startActivity(intent);
            }
        });
        /*예약번호 찾기 버튼 누르면 다음 페이지로 전환*/
        btn_getCode =findViewById(R.id.btn_resfind01);
        btn_getCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_main_01.this,yeab_app_resfind01.class);
                startActivity(intent);
            }
        });
        /*학교 주변 식당 보기 버튼 누르면 다음 페이지로 전환*/
        btn_mapshow= findViewById(R.id.btn_showmap);
        btn_mapshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_main_01.this,yeab_app_mapshow.class);
                startActivity(intent);
            }
        });

    }
}