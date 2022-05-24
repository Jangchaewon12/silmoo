package com.example.silmoo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

                }
                //배열 값 가져와서 스트링으로 만들기
                getArrayList = arrayList.toString();

                //배열 스트링 한 값 해싱
                String hashingPhoneNum = hashing(getArrayList);

                //입력 성공 출력 Toast
                Toast.makeText(yeab_app_resfind01.this, "입력 성공", Toast.LENGTH_SHORT).show();

                //번호 있는지 대조
                ref.child("inputUserInfo").child("phoneNum").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String boolPhoneNum = snapshot.getValue(String.class);

                        if(boolPhoneNum==hashingPhoneNum){
                            daezoSuccess();
                        }
                        else{
                            daezoFail();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
            }
        });
    }




    //(104-139행)Dialog 출처: https://everyshare.tistory.com/4 [에브리셰어:티스토리]*/
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

    public void daezoSuccess(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //(106행)출처: https://saeatechnote.tistory.com/entry/android안드로이드-Dialog-button-버튼-눌러-다이얼로그-띄우기 [새아의 테크노트:티스토리]
        builder.setTitle("예약번호 확인");
        builder.setMessage("고객님의 예약번호는 : "+"에야ㄱ번호"+"입니다.");

        builder.setNegativeButton("예",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //예 눌렀을때의 이벤트 처리
                        finish();
                    }
                });

        builder.show();
    }
    public void daezoFail(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //(106행)출처: https://saeatechnote.tistory.com/entry/android안드로이드-Dialog-button-버튼-눌러-다이얼로그-띄우기 [새아의 테크노트:티스토리]
        builder.setTitle("예약번호 확인 불가능");
        builder.setMessage("고객님의 예약번호는 존재하지 않습니다. 앱을 종료합니다.");

        builder.setNegativeButton("예",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //예 눌렀을때의 이벤트 처리
                        finish();
                    }
                });

        builder.show();
    }

}

