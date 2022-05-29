package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class yeab_app_reserve_02 extends AppCompatActivity {

    EditText et_phoneNumber;
    ImageButton Ibtn_before;
    ImageButton Ibtn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve02);


        et_phoneNumber = findViewById(R.id.et_phoneNumber);

        Ibtn_next = findViewById(R.id.Ibtn_next);
        Ibtn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 전화번호 String으로 저장
                String getEdit = et_phoneNumber.getText().toString().trim();
                // 공백이 있거나, 특수문자가 있거나, 11자리가 아닌 경우 값 안받고 Toast로 안내창 띄움 - https://kkh0977.tistory.com/53 특수문자 확인하는 코드 출처
                String getArrayList;
                ArrayList<Character> arrayList = new ArrayList<>();

                boolean x;
                int i;
                if ((getEdit.getBytes().length < 11 || getEdit.getBytes().length > 11)) {
                    Toast.makeText(yeab_app_reserve_02.this, "숫자로만 11자리 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                    x=false;
                    return;}
                if(x=true) {
                    for (i = 0; i < getEdit.length(); i++) {
                        if (String.valueOf(getEdit.charAt(i)).matches("[^a-zA-Z0-9\\s]")) { //특수문자 아닌 경우 배열에 저장
                            Toast.makeText(yeab_app_reserve_02.this, "공백, 특수문자는 입력 불가합니다.", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            //배열 값 가져와서 스트링으로 만들기
                            getArrayList = arrayList.toString();
                            //배열 스트링 한 값 해싱
                            String hashingPhoneNum = hashing(getArrayList);
                            //inputUserInfo(hashingPhoneNum);
                            //입력 성공 출력 Toast
                            Toast.makeText(yeab_app_reserve_02.this, "입력 성공", Toast.LENGTH_SHORT).show();
                            arrayList.add(getEdit.charAt(i));
                            Intent intent = new Intent(yeab_app_reserve_02.this, yeab_app_reserve_time.class);
                            startActivity(intent);
                        }
                    }
                }




            }
        });

        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(yeab_app_reserve_02.this, yeab_app_reserve_01.class);
                startActivity(intent);
            }
        });
    }

    public String hashing (String getArrayList)
    {//(71-88행)해싱 참고 - https://5stralia.tistory.com/m/18
        String result;
        try {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(getArrayList.getBytes());
            byte byteData[] = sh.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString(byteData[i] & 0xff + 0x100, 16).substring(1));
            }
            result = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            result = null;
        }

        return result;
    }
}