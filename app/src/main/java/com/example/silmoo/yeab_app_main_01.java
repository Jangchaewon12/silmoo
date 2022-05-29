
package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yeab_app_main_01 extends AppCompatActivity {

    Button btn_reservation;
    Button btn_getCode;
    Button btn_mapshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_main01);

        btn_reservation = findViewById(R.id.btn_reservation);
        btn_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_main_01.this, yeab_app_reserve_01.class);
                startActivity(intent);
            }
        });

        btn_getCode =findViewById(R.id.btn_resfind01);
        btn_getCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_main_01.this,yeab_app_resfind01.class);
                startActivity(intent);
            }
        });

        /*btn_mapshow= findViewById(R.id.btn_showmap);
        btn_mapshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yeab_app_main_01.this,yeab_app_mapshow.class);
                startActivity(intent);
            }
        });*/




    }
}

/*package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.silmoo.R;

public class yeab_app_main_01 extends AppCompatActivity {

    Button btn_reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_main_01);

        btn_reservation = findViewById(R.id.btn_reservation);
        btn_reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_main_01.this, yeab_app_reserve_01.class);
                startActivity(intent);
            }
        });

    }
}*/