package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class yeab_app_reserve_01 extends AppCompatActivity {

    // 처음부터 끝까지 '민에인' 작성

    /*변수 선언*/
    ImageButton Ibtn_before;
    ImageButton Ibtn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve01);

        /*이전 버튼(누르면 yeab_app_main_01로 돌아감)*/
        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_01.this, yeab_app_main_01.class);
                startActivity(intent);
            }
        });

        /*다음 버튼(누르면 yeab_app_reserve_02로 넘어감)*/
        Ibtn_next = findViewById(R.id.Ibtn_next);
        Ibtn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_01.this, yeab_app_reserve_02.class);
                startActivity(intent);
            }
        });

    }
}