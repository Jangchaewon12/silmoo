package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class yeab_app_resfind01 extends AppCompatActivity {


    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();
    private EditText yeab_app_resfind01_et_000;                    //전화번호 입력필드
    private Button yeab_app_resfind01_btn_000;                     //입력 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeab_app_resfind01);

        yeab_app_resfind01_et_000 = findViewById(R.id.yeab_app_resfind01_et_000);
        yeab_app_resfind01_btn_000 = findViewById(R.id.yeab_app_resfind01_btn_000);

        yeab_app_resfind01_btn_000.setOnClickListener(new View.OnClickListener() {//입력버튼이 눌리면 아래것을 실행 해라.
            @Override
            public void onClick(View v) {
                // 전화번호 string으로 저장
                String getEdit = yeab_app_resfind01_et_000.getText().toString();

                if ((getEdit.getBytes().length <= 0) || (getEdit.getBytes().length > 11)) {
                    Toast.makeText(yeab_app_resfind01.this, "최대 11자리 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if ((!getEdit.isEmpty())) {//빈값이 아니면 저장
                    inputUserPhoneNum(hashing(getEdit));
                    //입력 성공 출력 Toast
                    Toast.makeText(yeab_app_resfind01.this, "입력 성공", Toast.LENGTH_SHORT).show();
                    //화면 전환
                    Intent intent = new Intent(getApplicationContext(),yeab_app_resfind01_popup.class);
                    startActivity(intent);
                }
                //https://kkh0977.tistory.com/53 특수문자 확인 코드 출처

            }
            //공백 없이 입력받기 소스 참고 - [출처] 안드로이드 EditText의 NULL값 처리|작성자 CoMine, https://devuryu.tistory.com/42


        });

    }

    private void inputUserPhoneNum(String phoneNum) {//(60-70행)DB연동 소스 참고 - https://fjdkslvn.tistory.com/5**

        //여기에서 직접 변수를 만들어서 값을 직접 넣는것도 가능.

        //inputUserPhoneNum.java에서 선언했던 함수.
        inputUserPhoneNum inputUserPhoneNum = new inputUserPhoneNum();

        //child는 해당 키 위치로 이동하는 함수.
        ref.child("inputUserPhoneNum").child(phoneNum).setValue(inputUserPhoneNum);

    }
    public String hashing(String str) {//(71-88행)해싱 참고 - https://5stralia.tistory.com/m/18
        String result;
        try {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(str.getBytes());
            byte byteData[] = sh.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString(byteData[i] & 0xff + 0x100, 16).substring(1));
            }
            result = sb.toString();
        } catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
            result = null;
        }

        return result;
    }
}

