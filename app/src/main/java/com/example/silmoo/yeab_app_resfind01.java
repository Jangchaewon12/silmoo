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

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class yeab_app_resfind01 extends AppCompatActivity {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();   // 파이어베이스 데이터베이스 연동
    DatabaseReference ref = database.getReference();                    //DatabaseReference는 데이터베이스의 특정 위치로 연결하는 거
    private EditText yeab_app_resfind01_et_000;                         //전화번호 입력필드
    private Button yeab_app_resfind01_btn_000;                          //'입력' 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeab_app_resfind01);

        yeab_app_resfind01_et_000 = findViewById(R.id.yeab_app_resfind01_et_000);//버튼 아이디 연결
        yeab_app_resfind01_btn_000 = findViewById(R.id.yeab_app_resfind01_btn_000);//'입력' 버튼 연결

        yeab_app_resfind01_btn_000.setOnClickListener(new View.OnClickListener() {//입력버튼이 눌리면 아래것을 실행 해라.
            @Override
            public void onClick(View v) {
                // 전화번호 string으로 저장
                String getEdit = yeab_app_resfind01_et_000.getText().toString().trim();
                //공백이 있거나, 특수문자가 있거나, 11자리가 아닌 경우 값 안받고 Toast로 안내창 띄움 - https://kkh0977.tistory.com/53 특수문자 확인하는 코드 출처
                String getArrayList;
                ArrayList<Character> arrayList = new ArrayList<>();
                if(getEdit.getBytes().length<11 || getEdit.getBytes().length>11){
                    Toast.makeText(yeab_app_resfind01.this, "숫자로만 11자리 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    for (int i = 0; i < getEdit.length(); i++) {
                        if (String.valueOf(getEdit.charAt(i)).matches("[^a-zA-Z0-9\\s]")) { //특수문자 아닌 경우 배열에 저장
                            Toast.makeText(yeab_app_resfind01.this, "공백, 특수문자는 입력 불가합니다.", Toast.LENGTH_SHORT).show();
                            return;
                        }else {arrayList.add(getEdit.charAt(i));}
                    }

                //배열 값 가져와서 스트링으로 만들기
                getArrayList = arrayList.toString();

                //배열 스트링 한 값 해싱
                String hashingPhoneNum = hashing(getArrayList);
                inputUserInfo(hashingPhoneNum);
                //입력 성공 출력 Toast
                Toast.makeText(yeab_app_resfind01.this, "입력 성공", Toast.LENGTH_SHORT).show();
                //화면 전환
                Intent intent = new Intent(getApplicationContext(), yeab_app_resfind01_popup.class);
                startActivity(intent);
                }

            }
        });
    }

    private void inputUserInfo(String phoneNum) {//(60-70행)DB연동 소스 참고 - https://fjdkslvn.tistory.com/5**

        //여기에서 직접 변수를 만들어서 값을 직접 넣는것도 가능.

        //inputUserInfo.java에서 선언했던 함수.
        inputUserInfo inputUserInfo = new inputUserInfo(phoneNum);

        //child는 해당 키 위치로 이동하는 함수.
        ref.child("inputUserInfo").setValue(inputUserInfo);

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

