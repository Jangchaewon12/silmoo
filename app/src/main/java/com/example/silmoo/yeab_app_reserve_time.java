package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.SelectionEvent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class yeab_app_reserve_time extends AppCompatActivity {
    final FirebaseDatabase database = FirebaseDatabase.getInstance();   // 파이어베이스 데이터베이스 연동
    DatabaseReference ref = database.getReference();

    // 처음부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Intent intent;
    public Button btn_timeA, btn_timeB, btn_timeC, btn_timeD;
    ImageButton Ibtn_before;
    String StringA = "A";String StringB = "B";String StringC = "C";String StringD = "D";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_time);

        /*A타임 버튼 누르면 다음 페이지로 전환*/
        btn_timeA = findViewById(R.id.btn_timeA);
        btn_timeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_time.this, yeab_app_reserve_person.class);
                intent.putExtra("code_rt_time_A", "A");
                ref.child("inputUserInfo").child("inputUserSelectTime").setValue(StringA);//해당 줄 장채원 작성(DB관련)
                /*예약 코드 출력을 위해 'A' 값을 코드를 사용해 전달함*/
                /*이 코드를 입력하면 'A'(value)가 출력됨*/
                startActivity(intent);
            }
        });

        /*B타임 버튼 누르면 다음 페이지로 전환*/
        btn_timeB = findViewById(R.id.btn_timeB);
        btn_timeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_time.this, yeab_app_reserve_person.class);
                intent.putExtra("code_rt_time_B", "B");
                startActivity(intent);
            }
        });

        /*C타임 버튼 누르면 다음 페이지로 전환*/
        btn_timeC = findViewById(R.id.btn_timeC);
        btn_timeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_time.this, yeab_app_reserve_person.class);
                intent.putExtra("code_rt_time_C", "C");
                ref.child("inputUserInfo").child("inputUserSelectTime").setValue(StringC);//해당 줄 장채원 작성(DB관련)
                startActivity(intent);
            }
        });

        /*D타임 버튼 누르면 다음 페이지로 전환*/
        btn_timeD = findViewById(R.id.btn_timeD);
        btn_timeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_time.this, yeab_app_reserve_person.class);
                intent.putExtra("code_rt_time_D", "D");
                ref.child("inputUserInfo").child("inputUserSelectTime").setValue(StringD);//해당 줄 장채원 작성(DB관련)
                startActivity(intent);
            }
        });

        /*이전 버튼(누르면 yeab_app_reserve_02로 돌아감)*/
        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                intent = new Intent(yeab_app_reserve_time.this, yeab_app_reserve_02.class);
                startActivity(intent);
            }
        });

    }

}