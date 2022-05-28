package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class yeab_app_reserve_02 extends AppCompatActivity {

    ImageButton Ibtn_before;
    ImageButton Ibtn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve02);

        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_02.this, yeab_app_reserve_01.class);
                startActivity(intent);
            }
        });

        Ibtn_next = findViewById(R.id.Ibtn_next);
        Ibtn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(yeab_app_reserve_02.this, yeab_app_reserve_time.class);
                //startActivity(intent);
            }
        });

    }

}