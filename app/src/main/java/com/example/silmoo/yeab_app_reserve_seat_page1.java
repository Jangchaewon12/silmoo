package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class yeab_app_reserve_seat_page1 extends AppCompatActivity {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();   // 파이어베이스 데이터베이스 연동
    DatabaseReference ref = database.getReference(); // (DB관련 JCW가 작성.)

    // 처음부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Intent intent;
    Button btn_seat1, btn_seat2, btn_seat3, btn_seat4;
    Button btn_seat26, btn_seat46, btn_seat66, btn_seat86;
    Button btn_seat15, btn_seat35, btn_seat55, btn_seat75;
    Button btn_seat24, btn_seat44, btn_seat64, btn_seat84;
    Button btn_seat13, btn_seat33, btn_seat53, btn_seat73;
    Button btn_seat22, btn_seat42, btn_seat62, btn_seat82;
    Button btn_seat11, btn_seat31, btn_seat51, btn_seat71;
    ImageButton Ibtn_before;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_seat_page1);

        /*yeab_app_reserve_person에서 무슨 시간대를 전달했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String rt_time_A = intent.getStringExtra("code_rt_time_A");
        /*코드를 사용해 'A' 값을 전달받고 그 값을 String rt_time_A에 저장*/
        TextView t_resCodeTimeA = findViewById(R.id.t_resCodeTimeA);
        t_resCodeTimeA.setText(rt_time_A);
        /*A타임이 출력될 텍스트뷰 자리 t_resCodeTimeA에 'A' 값을 저장한 rt_time_A을 출력*/

        String rt_time_B = intent.getStringExtra("code_rt_time_B");
        TextView t_resCodeTimeB = findViewById(R.id.t_resCodeTimeB);
        t_resCodeTimeB.setText(rt_time_B);


        String rt_time_C = intent.getStringExtra("code_rt_time_C");
        TextView t_resCodeTimeC = findViewById(R.id.t_resCodeTimeC);
        t_resCodeTimeC.setText(rt_time_C);

        String rt_time_D = intent.getStringExtra("code_rt_time_D");
        TextView t_resCodeTimeD = findViewById(R.id.t_resCodeTimeD);
        t_resCodeTimeD.setText(rt_time_D);

        /*yeab_app_reserve_person에서 인원수 몇 명을 선택했는지 모르니까 다 전달받음*/

        String rs_person1 = intent.getStringExtra("code_person1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String rs_person1에 저장*/
        TextView t_resPerson1 = findViewById(R.id.t_resPerson1);
        t_resPerson1.setText(rs_person1);
        /*1명이 출력될 텍스트뷰 자리 t_resPerson1에 '1' 값을 저장한 rs_person1을 출력*/


        String rs_person2 = intent.getStringExtra("code_person2");
        TextView t_resPerson2 = findViewById(R.id.t_resPerson2);
        t_resPerson2.setText(rs_person2);


        String rs_person3 = intent.getStringExtra("code_person3");
        TextView t_resPerson3 = findViewById(R.id.t_resPerson3);
        t_resPerson3.setText(rs_person3);

        /*yeab_app_reserve_seat2에서 어디 좌석을 선택했는지 모르니까 다 전달받음*/
        String seat_page2_1 = intent.getStringExtra("code_seat_page2_1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String seat_page2_1에 저장*/
        TextView t_printSeat_page2_1 = findViewById(R.id.t_printSeat_page2_1);
        t_printSeat_page2_1.setText(seat_page2_1);
        /*1이 출력될 텍스트뷰 자리 t_printSeat_page2_1에 '1' 값을 저장한 seat_page2_1을 출력*/

        String seat_page2_2 = intent.getStringExtra("code_seat_page2_2");
        TextView t_printSeat_page2_2 = findViewById(R.id.t_printSeat_page2_2);
        t_printSeat_page2_2.setText(seat_page2_2);

        String seat_page2_3 = intent.getStringExtra("code_seat_page2_3");
        TextView t_printSeat_page2_3 = findViewById(R.id.t_printSeat_page2_3);
        t_printSeat_page2_3.setText(seat_page2_3);

        String seat_page2_4 = intent.getStringExtra("code_seat_page2_4");
        TextView t_printSeat_page2_4 = findViewById(R.id.t_printSeat_page2_4);
        t_printSeat_page2_4.setText(seat_page2_4);

        String seat_page2_26 = intent.getStringExtra("code_seat_page2_26");
        TextView t_printSeat_page2_26 = findViewById(R.id.t_printSeat_page2_26);
        t_printSeat_page2_26.setText(seat_page2_26);

        String seat_page2_46 = intent.getStringExtra("code_seat_page2_46");
        TextView t_printSeat_page2_46 = findViewById(R.id.t_printSeat_page2_46);
        t_printSeat_page2_46.setText(seat_page2_46);

        String seat_page2_66 = intent.getStringExtra("code_seat_page2_66");
        TextView t_printSeat_page2_66 = findViewById(R.id.t_printSeat_page2_66);
        t_printSeat_page2_66.setText(seat_page2_66);

        String seat_page2_86 = intent.getStringExtra("code_seat_page2_86");
        TextView t_printSeat_page2_86 = findViewById(R.id.t_printSeat_page2_86);
        t_printSeat_page2_86.setText(seat_page2_86);

        String seat_page2_15 = intent.getStringExtra("code_seat_page2_15");
        TextView t_printSeat_page2_15 = findViewById(R.id.t_printSeat_page2_15);
        t_printSeat_page2_15.setText(seat_page2_15);

        String seat_page2_35 = intent.getStringExtra("code_seat_page2_35");
        TextView t_printSeat_page2_35 = findViewById(R.id.t_printSeat_page2_35);
        t_printSeat_page2_35.setText(seat_page2_35);

        String seat_page2_55 = intent.getStringExtra("code_seat_page2_55");
        TextView t_printSeat_page2_55 = findViewById(R.id.t_printSeat_page2_55);
        t_printSeat_page2_55.setText(seat_page2_55);

        String seat_page2_75 = intent.getStringExtra("code_seat_page2_75");
        TextView t_printSeat_page2_75 = findViewById(R.id.t_printSeat_page2_75);
        t_printSeat_page2_75.setText(seat_page2_75);

        String seat_page2_24 = intent.getStringExtra("code_seat_page2_24");
        TextView t_printSeat_page2_24 = findViewById(R.id.t_printSeat_page2_24);
        t_printSeat_page2_24.setText(seat_page2_24);

        String seat_page2_44 = intent.getStringExtra("code_seat_page2_44");
        TextView t_printSeat_page2_44 = findViewById(R.id.t_printSeat_page2_44);
        t_printSeat_page2_44.setText(seat_page2_44);

        String seat_page2_64 = intent.getStringExtra("code_seat_page2_64");
        TextView t_printSeat_page2_64 = findViewById(R.id.t_printSeat_page2_64);
        t_printSeat_page2_64.setText(seat_page2_64);

        String seat_page2_84 = intent.getStringExtra("code_seat_page2_84");
        TextView t_printSeat_page2_84 = findViewById(R.id.t_printSeat_page2_84);
        t_printSeat_page2_84.setText(seat_page2_84);

        String seat_page2_13 = intent.getStringExtra("code_seat_page2_13");
        TextView t_printSeat_page2_13 = findViewById(R.id.t_printSeat_page2_13);
        t_printSeat_page2_13.setText(seat_page2_13);

        String seat_page2_33 = intent.getStringExtra("code_seat_page2_33");
        TextView t_printSeat_page2_33 = findViewById(R.id.t_printSeat_page2_33);
        t_printSeat_page2_33.setText(seat_page2_33);

        String seat_page2_53 = intent.getStringExtra("code_seat_page2_53");
        TextView t_printSeat_page2_53 = findViewById(R.id.t_printSeat_page2_53);
        t_printSeat_page2_53.setText(seat_page2_53);

        String seat_page2_73 = intent.getStringExtra("code_seat_page2_73");
        TextView t_printSeat_page2_73 = findViewById(R.id.t_printSeat_page2_73);
        t_printSeat_page2_73.setText(seat_page2_73);

        String seat_page2_22 = intent.getStringExtra("code_seat_page2_22");
        TextView t_printSeat_page2_22 = findViewById(R.id.t_printSeat_page2_22);
        t_printSeat_page2_22.setText(seat_page2_22);

        String seat_page2_42 = intent.getStringExtra("code_seat_page2_42");
        TextView t_printSeat_page2_42 = findViewById(R.id.t_printSeat_page2_42);
        t_printSeat_page2_42.setText(seat_page2_42);

        String seat_page2_62 = intent.getStringExtra("code_seat_page2_62");
        TextView t_printSeat_page2_62 = findViewById(R.id.t_printSeat_page2_62);
        t_printSeat_page2_62.setText(seat_page2_62);

        String seat_page2_82 = intent.getStringExtra("code_seat_page2_82");
        TextView t_printSeat_page2_82 = findViewById(R.id.t_printSeat_page2_82);
        t_printSeat_page2_82.setText(seat_page2_82);

        String seat_page2_11 = intent.getStringExtra("code_seat_page2_11");
        TextView t_printSeat_page2_11 = findViewById(R.id.t_printSeat_page2_11);
        t_printSeat_page2_11.setText(seat_page2_11);

        String seat_page2_31 = intent.getStringExtra("code_seat_page2_31");
        TextView t_printSeat_page2_31 = findViewById(R.id.t_printSeat_page2_31);
        t_printSeat_page2_31.setText(seat_page2_31);

        String seat_page2_51 = intent.getStringExtra("code_seat_page2_51");
        TextView t_printSeat_page2_51 = findViewById(R.id.t_printSeat_page2_51);
        t_printSeat_page2_51.setText(seat_page2_51);

        String seat_page2_71 = intent.getStringExtra("code_seat_page2_71");
        TextView t_printSeat_page2_71 = findViewById(R.id.t_printSeat_page2_71);
        t_printSeat_page2_71.setText(seat_page2_71);

        /*yeab_app_reserve_seat3에서 어디 좌석을 선택했는지 모르니까 다 전달받음*/
        String seat_page3_1 = intent.getStringExtra("code_seat_page3_1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String seat_page3_1에 저장*/
        TextView t_printSeat_page3_1 = findViewById(R.id.t_printSeat_page3_1);
        t_printSeat_page3_1.setText(seat_page3_1);
        /*1이 출력될 텍스트뷰 자리 t_printSeat_page3_1에 '1' 값을 저장한 seat_page3_1을 출력*/

        String seat_page3_2 = intent.getStringExtra("code_seat_page3_2");
        TextView t_printSeat_page3_2 = findViewById(R.id.t_printSeat_page3_2);
        t_printSeat_page3_2.setText(seat_page3_2);

        String seat_page3_3 = intent.getStringExtra("code_seat_page3_3");
        TextView t_printSeat_page3_3 = findViewById(R.id.t_printSeat_page3_3);
        t_printSeat_page3_3.setText(seat_page3_3);

        String seat_page3_4 = intent.getStringExtra("code_seat_page3_4");
        TextView t_printSeat_page3_4 = findViewById(R.id.t_printSeat_page3_4);
        t_printSeat_page3_4.setText(seat_page3_4);

        String seat_page3_26 = intent.getStringExtra("code_seat_page3_26");
        TextView t_printSeat_page3_26 = findViewById(R.id.t_printSeat_page3_26);
        t_printSeat_page3_26.setText(seat_page3_26);

        String seat_page3_46 = intent.getStringExtra("code_seat_page3_46");
        TextView t_printSeat_page3_46 = findViewById(R.id.t_printSeat_page3_46);
        t_printSeat_page3_46.setText(seat_page3_46);

        String seat_page3_66 = intent.getStringExtra("code_seat_page3_66");
        TextView t_printSeat_page3_66 = findViewById(R.id.t_printSeat_page3_66);
        t_printSeat_page3_66.setText(seat_page3_66);

        String seat_page3_86 = intent.getStringExtra("code_seat_page3_86");
        TextView t_printSeat_page3_86 = findViewById(R.id.t_printSeat_page3_86);
        t_printSeat_page3_86.setText(seat_page3_86);

        String seat_page3_15 = intent.getStringExtra("code_seat_page3_15");
        TextView t_printSeat_page3_15 = findViewById(R.id.t_printSeat_page3_15);
        t_printSeat_page3_15.setText(seat_page3_15);

        String seat_page3_35 = intent.getStringExtra("code_seat_page3_35");
        TextView t_printSeat_page3_35 = findViewById(R.id.t_printSeat_page3_35);
        t_printSeat_page3_35.setText(seat_page3_35);

        String seat_page3_55 = intent.getStringExtra("code_seat_page3_55");
        TextView t_printSeat_page3_55 = findViewById(R.id.t_printSeat_page3_55);
        t_printSeat_page3_55.setText(seat_page3_55);

        String seat_page3_75 = intent.getStringExtra("code_seat_page3_75");
        TextView t_printSeat_page3_75 = findViewById(R.id.t_printSeat_page3_75);
        t_printSeat_page3_75.setText(seat_page3_75);

        String seat_page3_24 = intent.getStringExtra("code_seat_page3_24");
        TextView t_printSeat_page3_24 = findViewById(R.id.t_printSeat_page3_24);
        t_printSeat_page3_24.setText(seat_page3_24);

        String seat_page3_44 = intent.getStringExtra("code_seat_page3_44");
        TextView t_printSeat_page3_44 = findViewById(R.id.t_printSeat_page3_44);
        t_printSeat_page3_44.setText(seat_page3_44);

        String seat_page3_64 = intent.getStringExtra("code_seat_page3_64");
        TextView t_printSeat_page3_64 = findViewById(R.id.t_printSeat_page3_64);
        t_printSeat_page3_64.setText(seat_page3_64);

        String seat_page3_84 = intent.getStringExtra("code_seat_page3_84");
        TextView t_printSeat_page3_84 = findViewById(R.id.t_printSeat_page3_84);
        t_printSeat_page3_84.setText(seat_page3_84);

        String seat_page3_13 = intent.getStringExtra("code_seat_page3_13");
        TextView t_printSeat_page3_13 = findViewById(R.id.t_printSeat_page3_13);
        t_printSeat_page3_13.setText(seat_page3_13);

        String seat_page3_33 = intent.getStringExtra("code_seat_page3_33");
        TextView t_printSeat_page3_33 = findViewById(R.id.t_printSeat_page3_33);
        t_printSeat_page3_33.setText(seat_page3_33);

        String seat_page3_53 = intent.getStringExtra("code_seat_page3_53");
        TextView t_printSeat_page3_53 = findViewById(R.id.t_printSeat_page3_53);
        t_printSeat_page3_53.setText(seat_page3_53);

        String seat_page3_73 = intent.getStringExtra("code_seat_page3_73");
        TextView t_printSeat_page3_73 = findViewById(R.id.t_printSeat_page3_73);
        t_printSeat_page3_73.setText(seat_page3_73);

        String seat_page3_22 = intent.getStringExtra("code_seat_page3_22");
        TextView t_printSeat_page3_22 = findViewById(R.id.t_printSeat_page3_22);
        t_printSeat_page3_22.setText(seat_page3_22);

        String seat_page3_42 = intent.getStringExtra("code_seat_page3_42");
        TextView t_printSeat_page3_42 = findViewById(R.id.t_printSeat_page3_42);
        t_printSeat_page3_42.setText(seat_page3_42);

        String seat_page3_62 = intent.getStringExtra("code_seat_page3_62");
        TextView t_printSeat_page3_62 = findViewById(R.id.t_printSeat_page3_62);
        t_printSeat_page3_62.setText(seat_page3_62);

        String seat_page3_82 = intent.getStringExtra("code_seat_page3_82");
        TextView t_printSeat_page3_82 = findViewById(R.id.t_printSeat_page3_82);
        t_printSeat_page3_82.setText(seat_page3_82);

        String seat_page3_11 = intent.getStringExtra("code_seat_page3_11");
        TextView t_printSeat_page3_11 = findViewById(R.id.t_printSeat_page3_11);
        t_printSeat_page3_11.setText(seat_page3_11);

        String seat_page3_31 = intent.getStringExtra("code_seat_page3_31");
        TextView t_printSeat_page3_31 = findViewById(R.id.t_printSeat_page3_31);
        t_printSeat_page3_31.setText(seat_page3_31);

        String seat_page3_51 = intent.getStringExtra("code_seat_page3_51");
        TextView t_printSeat_page3_51 = findViewById(R.id.t_printSeat_page3_51);
        t_printSeat_page3_51.setText(seat_page3_51);

        String seat_page3_71 = intent.getStringExtra("code_seat_page3_71");
        TextView t_printSeat_page3_71 = findViewById(R.id.t_printSeat_page3_71);
        t_printSeat_page3_71.setText(seat_page3_71);

        /*1번 좌석을 누르면 yeab_app_reserve_resCodePrint으로 넘어감)*/
        btn_seat1 = findViewById(R.id.btn_seat1);
        btn_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);

                intent.putExtra("code_seat_page1_1", "1");

                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("1");//해당 줄 JCW(장채원) 작성
                /*예약 코드 출력을 위해 '1' 값 전달*/

                {
                    /*이전 페이지에서 버튼 클릭 이벤트로 값을 putExtra()하여 전달하게끔 했으니 선택하지 않은 시간대의 값은 null*/
                    /*즉, null 값이 아닌 것은 이전 페이지에서 전달한 시간대라는 것을 의미함*/
                    /*null 값이 아니면(이전에 전달한 시간대라면) 그 시간대를 다음 페이지에 또 전달해라(예약 코드를 출력하기 위함)*/
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    /*이전 페이지에서 버튼 클릭 이벤트로 값을 putExtra()하여 전달하게끔 했으니 선택하지 않은 인원수의 값은 null*/
                    /*즉, null 값이 아닌 것은 이전 페이지에서 전달한 인원수라는 것을 의미함*/
                    /*null 값이 아니면(이전에 전달한 인원수라면) 그 인원수를 다음 페이지에 또 전달해라(예약 코드를 출력하기 위함)*/
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat2 = findViewById(R.id.btn_seat2);
        btn_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_2", "2");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("2");//해당 줄 JCW(장채원) 작성
                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat3 = findViewById(R.id.btn_seat3);
        btn_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_3", "3");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("3");//해당 줄 JCW(장채원) 작성
                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat4 = findViewById(R.id.btn_seat4);
        btn_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_4", "4");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("4");//해당 줄 JCW(장채원) 작성
                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat26 = findViewById(R.id.btn_seat26);
        btn_seat26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_26", "26");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("26");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat46 = findViewById(R.id.btn_seat46);
        btn_seat46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_46", "46");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("46");//해당 줄 JCW(장채원) 작성


                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat66 = findViewById(R.id.btn_seat66);
        btn_seat66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_66", "66");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("66");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat86 = findViewById(R.id.btn_seat86);
        btn_seat86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_86", "86");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("86");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat15 = findViewById(R.id.btn_seat15);
        btn_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_15", "15");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("15");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat35 = findViewById(R.id.btn_seat35);
        btn_seat35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_35", "35");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("35");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat55 = findViewById(R.id.btn_seat55);
        btn_seat55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_55", "55");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("55");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat75 = findViewById(R.id.btn_seat75);
        btn_seat75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_75", "75");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("75");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat24 = findViewById(R.id.btn_seat24);
        btn_seat24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_24", "24");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("24");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat44 = findViewById(R.id.btn_seat44);
        btn_seat44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_44", "44");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("44");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat64 = findViewById(R.id.btn_seat64);
        btn_seat64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_64", "64");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("64");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat84 = findViewById(R.id.btn_seat84);
        btn_seat84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_84", "84");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("84");//해당 줄 JCW(장채원) 작성


                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat13 = findViewById(R.id.btn_seat13);
        btn_seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_13", "13");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("13");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat33 = findViewById(R.id.btn_seat33);
        btn_seat33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_33", "33");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("33");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat53 = findViewById(R.id.btn_seat53);
        btn_seat53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_53", "53");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("53");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat73 = findViewById(R.id.btn_seat73);
        btn_seat73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_73", "73");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("73");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat22 = findViewById(R.id.btn_seat22);
        btn_seat22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_22", "22");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("22");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat42 = findViewById(R.id.btn_seat42);
        btn_seat42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_42", "42");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("42");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat62 = findViewById(R.id.btn_seat62);
        btn_seat62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_62", "62");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("62");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat82 = findViewById(R.id.btn_seat82);
        btn_seat82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_82", "82");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("82");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat11 = findViewById(R.id.btn_seat11);
        btn_seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_11", "11");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue("11");//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat31 = findViewById(R.id.btn_seat31);
        btn_seat31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_31", "31");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue(31);//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat51 = findViewById(R.id.btn_seat51);
        btn_seat51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_51", "51");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue(51);//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        btn_seat71 = findViewById(R.id.btn_seat71);
        btn_seat71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_71", "71");
                ref.child("inputUserInfo").child("inputUserSelectSeat").setValue(71);//해당 줄 JCW(장채원) 작성

                {
                    if(rt_time_A != null){
                        intent.putExtra("code_rt_time_A", "A");
                    }
                    else if(rt_time_B != null){
                        intent.putExtra("code_rt_time_B", "B");
                    }
                    else if(rt_time_C != null){
                        intent.putExtra("code_rt_time_C", "C");
                    }
                    else if(rt_time_D != null){
                        intent.putExtra("code_rt_time_D", "D");
                    }
                }

                {
                    if (rs_person1 != null) {
                        intent.putExtra("code_person1", "1");
                    } else if (rs_person2 != null) {
                        intent.putExtra("code_person2", "2");
                    } else if (rs_person3 != null) {
                        intent.putExtra("code_person3", "3");
                    }
                }

                {
                    if (seat_page2_1 != null){
                        intent.putExtra("code_seat_page2_1", "1");
                    } else if (seat_page2_2 != null){
                        intent.putExtra("code_seat_page2_2", "2");
                    } else if (seat_page2_3 != null){
                        intent.putExtra("code_seat_page2_3", "3");
                    } else if (seat_page2_4 != null){
                        intent.putExtra("code_seat_page2_4", "4");
                    } else if (seat_page2_26 != null){
                        intent.putExtra("code_seat_page2_26", "26");
                    } else if (seat_page2_46 != null){
                        intent.putExtra("code_seat_page2_46", "46");
                    } else if (seat_page2_66 != null){
                        intent.putExtra("code_seat_page2_66", "66");
                    } else if (seat_page2_86 != null){
                        intent.putExtra("code_seat_page2_86", "86");
                    } else if (seat_page2_15 != null){
                        intent.putExtra("code_seat_page2_15", "15");
                    } else if (seat_page2_35 != null){
                        intent.putExtra("code_seat_page2_35", "35");
                    } else if (seat_page2_55 != null){
                        intent.putExtra("code_seat_page2_55", "55");
                    } else if (seat_page2_75 != null){
                        intent.putExtra("code_seat_page2_75", "75");
                    } else if (seat_page2_24 != null){
                        intent.putExtra("code_seat_page2_24", "24");
                    } else if (seat_page2_44 != null){
                        intent.putExtra("code_seat_page2_44", "44");
                    } else if (seat_page2_64 != null){
                        intent.putExtra("code_seat_page2_64", "64");
                    } else if (seat_page2_84 != null){
                        intent.putExtra("code_seat_page2_84", "84");
                    } else if (seat_page2_13 != null){
                        intent.putExtra("code_seat_page2_13", "13");
                    } else if (seat_page2_33 != null){
                        intent.putExtra("code_seat_page2_33", "33");
                    } else if (seat_page2_53 != null){
                        intent.putExtra("code_seat_page2_53", "53");
                    } else if (seat_page2_73 != null){
                        intent.putExtra("code_seat_page2_73", "73");
                    } else if (seat_page2_22 != null){
                        intent.putExtra("code_seat_page2_22", "22");
                    } else if (seat_page2_42 != null){
                        intent.putExtra("code_seat_page2_42", "42");
                    } else if (seat_page2_62 != null){
                        intent.putExtra("code_seat_page2_62", "62");
                    } else if (seat_page2_82 != null){
                        intent.putExtra("code_seat_page2_82", "82");
                    } else if (seat_page2_11 != null){
                        intent.putExtra("code_seat_page2_11", "11");
                    } else if (seat_page2_31 != null){
                        intent.putExtra("code_seat_page2_31", "31");
                    } else if (seat_page2_51 != null){
                        intent.putExtra("code_seat_page2_51", "51");
                    } else if (seat_page2_71 != null){
                        intent.putExtra("code_seat_page2_71", "71");
                    }
                }

                {
                    if (seat_page3_1 != null){
                        intent.putExtra("code_seat_page3_1", "1");
                    } else if (seat_page3_2 != null){
                        intent.putExtra("code_seat_page3_2", "2");
                    } else if (seat_page3_3 != null){
                        intent.putExtra("code_seat_page3_3", "3");
                    } else if (seat_page3_4 != null){
                        intent.putExtra("code_seat_page3_4", "4");
                    } else if (seat_page3_26 != null){
                        intent.putExtra("code_seat_page3_26", "26");
                    } else if (seat_page3_46 != null){
                        intent.putExtra("code_seat_page3_46", "46");
                    } else if (seat_page3_66 != null){
                        intent.putExtra("code_seat_page3_66", "66");
                    } else if (seat_page3_86 != null){
                        intent.putExtra("code_seat_page3_86", "86");
                    } else if (seat_page3_15 != null){
                        intent.putExtra("code_seat_page3_15", "15");
                    } else if (seat_page3_35 != null){
                        intent.putExtra("code_seat_page3_35", "35");
                    } else if (seat_page3_55 != null){
                        intent.putExtra("code_seat_page3_55", "55");
                    } else if (seat_page3_75 != null){
                        intent.putExtra("code_seat_page3_75", "75");
                    } else if (seat_page3_24 != null){
                        intent.putExtra("code_seat_page3_24", "24");
                    } else if (seat_page3_44 != null){
                        intent.putExtra("code_seat_page3_44", "44");
                    } else if (seat_page3_64 != null){
                        intent.putExtra("code_seat_page3_64", "64");
                    } else if (seat_page3_84 != null){
                        intent.putExtra("code_seat_page3_84", "84");
                    } else if (seat_page3_13 != null){
                        intent.putExtra("code_seat_page3_13", "13");
                    } else if (seat_page3_33 != null){
                        intent.putExtra("code_seat_page3_33", "33");
                    } else if (seat_page3_53 != null){
                        intent.putExtra("code_seat_page3_53", "53");
                    } else if (seat_page3_73 != null){
                        intent.putExtra("code_seat_page3_73", "73");
                    } else if (seat_page3_22 != null){
                        intent.putExtra("code_seat_page3_22", "22");
                    } else if (seat_page3_42 != null){
                        intent.putExtra("code_seat_page3_42", "42");
                    } else if (seat_page3_62 != null){
                        intent.putExtra("code_seat_page3_62", "62");
                    } else if (seat_page3_82 != null){
                        intent.putExtra("code_seat_page3_82", "82");
                    } else if (seat_page3_11 != null){
                        intent.putExtra("code_seat_page3_11", "11");
                    } else if (seat_page3_31 != null){
                        intent.putExtra("code_seat_page3_31", "31");
                    } else if (seat_page3_51 != null){
                        intent.putExtra("code_seat_page3_51", "51");
                    } else if (seat_page3_71 != null){
                        intent.putExtra("code_seat_page3_71", "71");
                    }
                }

                startActivity(intent);
            }
        });

        /*이전 버튼(누르면 yeab_app_reserve_person으로 돌아감)*/
        Ibtn_before = findViewById(R.id.Ibtn_before);
        Ibtn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_time.class);
                startActivity(intent);
            }
        });

    }
}