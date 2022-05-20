package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;

public class yeab_app_resfind01 extends AppCompatActivity {


    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();
    private EditText et_000;                    //전화번호 입력필드
    private Button btn_000;                     //입력 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yeab_app_resfind01);

        et_000 = findViewById(R.id.et_000);
        btn_000 = findViewById(R.id.btn_000);

        btn_000.setOnClickListener(new View.OnClickListener() {//입력버튼이 눌리면 아래것을 실행 해라.
            @Override
            public void onClick(View v) {
                // 전화번호 string으로 저장
                String getEdit = et_000.getText().toString();

                if((getEdit.getBytes().length <= 0)||(getEdit.getBytes().length > 11)) {
                    Toast.makeText(yeab_app_resfind01.this, "최대 11자리 숫자를 입력하세요.", Toast.LENGTH_SHORT).show();
                }else if((getEdit.getBytes().length >= 0)){//빈값이 아니면 저장
                    //inputUserPhoneNum(getEdit.trim());
                    String result = "";
                    for(int i=0; i<getEdit.length(); i++) {
                        if (String.valueOf(getEdit.charAt(i)).matches("[^a-zA-Z0-9]")) { // 특수문자 인 경우
                            continue;
                        }
                        else {
                                inputUserPhoneNum(getEdit);
                            }
                        }
                    }
                    //https://kkh0977.tistory.com/53 특수문자 확인 코드 출처

                    Toast.makeText(yeab_app_resfind01.this,"입력 성공",Toast.LENGTH_SHORT).show();
                }
                //공백 없이 입력받기 소스 참고 - [출처] 안드로이드 EditText의 NULL값 처리|작성자 CoMine, https://devuryu.tistory.com/42




        });

    }
    public void inputUserPhoneNum(String phoneNum) {

        //여기에서 직접 변수를 만들어서 값을 직접 넣는것도 가능합니다.
        // ex) 갓 태어난 동물만 입력해서 int age=1; 등을 넣는 경우

        //inputUserPhoneNum.java에서 선언했던 함수.
        inputUserPhoneNum inputUserPhoneNum = new inputUserPhoneNum(phoneNum);

        //child는 해당 키 위치로 이동하는 함수입니다.
        //키가 없는데 "zoo"와 name같이 값을 지정한 경우 자동으로 생성합니다.
        ref.child("inputUserPhoneNum").child(phoneNum).setValue(inputUserPhoneNum);

    }
}
//**DB연동 소스 참고 - https://fjdkslvn.tistory.com/5**
