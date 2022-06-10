package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class yeab_app_mapshow extends AppCompatActivity {

    ImageButton btn_mapshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_mapshow);
        Toast.makeText(getApplicationContext(),"학교로부터 1KM 반경 이내의 음식점 정보 사진입니다. \n 클릭시 네이버 지도 페이지로 이동합니다.",Toast.LENGTH_LONG).show();

        btn_mapshow = findViewById(R.id.btn_mapshow);
        btn_mapshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "네이버 지도 페이지로 이동합니다.",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%8C%EC%8B%9D%EC%A0%90?c=14134479.7249499,4520215.6263598,15,0,0,0,dh"));
                startActivity(intent);
            }
        });

    }
}