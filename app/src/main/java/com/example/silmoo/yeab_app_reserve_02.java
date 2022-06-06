package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class yeab_app_reserve_02 extends AppCompatActivity{

    EditText et_phoneNumber;
    ImageButton Ibtn_before;
    ImageButton Ibtn_next;

    final FirebaseDatabase database = FirebaseDatabase.getInstance();   // 파이어베이스 데이터베이스 연동
    DatabaseReference ref = database.getReference();

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

                int i;
                if ((getEdit.getBytes().length < 11 || getEdit.getBytes().length > 11)) {
                    Toast.makeText(yeab_app_reserve_02.this, "숫자로만 11자리 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                    return;}
                else{
                    for (i = 0; i < getEdit.length(); i++) {
                        if (String.valueOf(getEdit.charAt(i)).matches("[^a-zA-Z0-9\\s]")) { //특수문자 아닌 경우 배열에 저장
                            Toast.makeText(yeab_app_reserve_02.this, "공백, 특수문자는 입력 불가합니다.", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            arrayList.add(getEdit.charAt(i));
                            //배열 값 가져와서 스트링으로 만들기
                            getArrayList = arrayList.toString();
                            //배열 스트링 한 값 해싱 후 DB에 저장
                            addInputUserInfo(getArrayList);


                        }
                        //입력 성공 출력 Toast
                        Toast.makeText(yeab_app_reserve_02.this, "입력 성공", Toast.LENGTH_SHORT).show();
                        //화면 전환
                        Intent intent = new Intent(yeab_app_reserve_02.this, yeab_app_reserve_time.class);
                        startActivity(intent);
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
    private void addInputUserInfo(String phoneNum) {
        //inputUserInfo.java에서 선언했던 함수.
        inputUserInfo inputUserPhoneNum = new inputUserInfo(hashing(phoneNum));
        ref.child("inputUserInfo").child("inputUserPhoneNum").setValue(inputUserPhoneNum);
    }
}
//--------yeab_app_reserve_02는 xml 민예인, java 장채원이 씀.-------