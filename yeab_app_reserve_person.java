package com.chobo.yeab_swproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class yeab_app_reserve_person extends AppCompatActivity {

    boolean timeResA, timeResB, timeResC, timeResD;
    Intent intent;
    Button btn_1person, btn_2person, btn_3person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_person);

        intent = getIntent();
        String rt_time_A = intent.getStringExtra("code_rt_time_A");
        TextView t_resCodeTimeA = (TextView) findViewById(R.id.t_resCodeTimeA);
        t_resCodeTimeA.setText(rt_time_A);

        intent = getIntent();
        String rt_time_B = intent.getStringExtra("code_rt_time_B");
        TextView t_resCodeTimeB = (TextView) findViewById(R.id.t_resCodeTimeB);
        t_resCodeTimeB.setText(rt_time_B);

        intent = getIntent();
        String rt_time_C = intent.getStringExtra("code_rt_time_C");
        TextView t_resCodeTimeC = (TextView) findViewById(R.id.t_resCodeTimeC);
        t_resCodeTimeC.setText(rt_time_C);

        intent = getIntent();
        String rt_time_D = intent.getStringExtra("code_rt_time_D");
        TextView t_resCodeTimeD = (TextView) findViewById(R.id.t_resCodeTimeD);
        t_resCodeTimeD.setText(rt_time_D);

        btn_1person = findViewById(R.id.btn_1person);
        btn_1person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page1.class);
                if (v.getId() == R.id.btn_timeA){
                    intent.putExtra("code_rt_time_A", "A");
                }
                if(timeResA = true){
                    intent.putExtra("code_rt_time_A", "A");
                }
                if(timeResB = true){
                    intent.putExtra("code_rt_time_B", "B");
                }
                if(timeResC = true){
                    intent.putExtra("code_rt_time_C", "C");
                }
                if(timeResD = true){
                    intent.putExtra("code_rt_time_D", "D");
                }
                startActivity(intent);
            }

        });

        btn_2person = findViewById(R.id.btn_2person);
        btn_2person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page2.class);
                startActivity(intent);
            }
        });

        btn_3person = findViewById(R.id.btn_3person);
        btn_3person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_reserve_person.this, yeab_app_reserve_seat_page3.class);
                startActivity(intent);
            }
        });

    }
}