package com.example.silmoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.core.Context;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;


public class yeab_app_resfind01_popup extends AppCompatActivity {//(전체 행)안드로이드 파이어베이스 데이터 읽기 소스 참고 - https://fjdkslvn.tistory.com/17?category=1014477


    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_resfind01_popup);

        ref.child("inputUserInfo").child("phoneNum").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                String phoneNum = value;
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.e("error", String.valueOf(databaseError.toException())); // 에러문 출력
            }
        });

    }

}
