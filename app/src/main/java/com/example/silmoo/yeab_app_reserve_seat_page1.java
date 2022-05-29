package com.example.silmoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class yeab_app_reserve_seat_page1 extends AppCompatActivity {

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

        intent = getIntent();
        String rt_time_A = intent.getStringExtra("code_rt_time_A");
        TextView t_resCodeTimeA = findViewById(R.id.t_resCodeTimeA);
        t_resCodeTimeA.setText(rt_time_A);

        intent = getIntent();
        String rt_time_B = intent.getStringExtra("code_rt_time_B");
        TextView t_resCodeTimeB = findViewById(R.id.t_resCodeTimeB);
        t_resCodeTimeB.setText(rt_time_B);

        intent = getIntent();
        String rt_time_C = intent.getStringExtra("code_rt_time_C");
        TextView t_resCodeTimeC = findViewById(R.id.t_resCodeTimeC);
        t_resCodeTimeC.setText(rt_time_C);

        intent = getIntent();
        String rt_time_D = intent.getStringExtra("code_rt_time_D");
        TextView t_resCodeTimeD = findViewById(R.id.t_resCodeTimeD);
        t_resCodeTimeD.setText(rt_time_D);

        intent = getIntent();
        String rs_person1 = intent.getStringExtra("code_person1");
        TextView t_resPerson1 = findViewById(R.id.t_resPerson1);
        t_resPerson1.setText(rs_person1);

        intent = getIntent();
        String rs_person2 = intent.getStringExtra("code_person2");
        TextView t_resPerson2 = findViewById(R.id.t_resPerson2);
        t_resPerson2.setText(rs_person2);

        intent = getIntent();
        String rs_person3 = intent.getStringExtra("code_person3");
        TextView t_resPerson3 = findViewById(R.id.t_resPerson3);
        t_resPerson3.setText(rs_person3);

        intent = getIntent();
        String seat_page2_1 = intent.getStringExtra("code_seat_page2_1");
        TextView t_printSeat_page2_1 = findViewById(R.id.t_printSeat_page2_1);
        t_printSeat_page2_1.setText(seat_page2_1);

        intent = getIntent();
        String seat_page2_2 = intent.getStringExtra("code_seat_page2_2");
        TextView t_printSeat_page2_2 = findViewById(R.id.t_printSeat_page2_2);
        t_printSeat_page2_2.setText(seat_page2_2);

        intent = getIntent();
        String seat_page2_3 = intent.getStringExtra("code_seat_page2_3");
        TextView t_printSeat_page2_3 = findViewById(R.id.t_printSeat_page2_3);
        t_printSeat_page2_3.setText(seat_page2_3);

        intent = getIntent();
        String seat_page2_4 = intent.getStringExtra("code_seat_page2_4");
        TextView t_printSeat_page2_4 = findViewById(R.id.t_printSeat_page2_4);
        t_printSeat_page2_4.setText(seat_page2_4);

        intent = getIntent();
        String seat_page2_26 = intent.getStringExtra("code_seat_page2_26");
        TextView t_printSeat_page2_26 = findViewById(R.id.t_printSeat_page2_26);
        t_printSeat_page2_26.setText(seat_page2_26);

        intent = getIntent();
        String seat_page2_46 = intent.getStringExtra("code_seat_page2_46");
        TextView t_printSeat_page2_46 = findViewById(R.id.t_printSeat_page2_46);
        t_printSeat_page2_46.setText(seat_page2_46);

        intent = getIntent();
        String seat_page2_66 = intent.getStringExtra("code_seat_page2_66");
        TextView t_printSeat_page2_66 = findViewById(R.id.t_printSeat_page2_66);
        t_printSeat_page2_66.setText(seat_page2_66);

        intent = getIntent();
        String seat_page2_86 = intent.getStringExtra("code_seat_page2_86");
        TextView t_printSeat_page2_86 = findViewById(R.id.t_printSeat_page2_86);
        t_printSeat_page2_86.setText(seat_page2_86);

        intent = getIntent();
        String seat_page2_15 = intent.getStringExtra("code_seat_page2_15");
        TextView t_printSeat_page2_15 = findViewById(R.id.t_printSeat_page2_15);
        t_printSeat_page2_15.setText(seat_page2_15);

        intent = getIntent();
        String seat_page2_35 = intent.getStringExtra("code_seat_page2_35");
        TextView t_printSeat_page2_35 = findViewById(R.id.t_printSeat_page2_35);
        t_printSeat_page2_35.setText(seat_page2_35);

        intent = getIntent();
        String seat_page2_55 = intent.getStringExtra("code_seat_page2_55");
        TextView t_printSeat_page2_55 = findViewById(R.id.t_printSeat_page2_55);
        t_printSeat_page2_55.setText(seat_page2_55);

        intent = getIntent();
        String seat_page2_75 = intent.getStringExtra("code_seat_page2_75");
        TextView t_printSeat_page2_75 = findViewById(R.id.t_printSeat_page2_75);
        t_printSeat_page2_75.setText(seat_page2_75);

        intent = getIntent();
        String seat_page2_24 = intent.getStringExtra("code_seat_page2_24");
        TextView t_printSeat_page2_24 = findViewById(R.id.t_printSeat_page2_24);
        t_printSeat_page2_24.setText(seat_page2_24);

        intent = getIntent();
        String seat_page2_44 = intent.getStringExtra("code_seat_page2_44");
        TextView t_printSeat_page2_44 = findViewById(R.id.t_printSeat_page2_44);
        t_printSeat_page2_44.setText(seat_page2_44);

        intent = getIntent();
        String seat_page2_64 = intent.getStringExtra("code_seat_page2_64");
        TextView t_printSeat_page2_64 = findViewById(R.id.t_printSeat_page2_64);
        t_printSeat_page2_64.setText(seat_page2_64);

        intent = getIntent();
        String seat_page2_84 = intent.getStringExtra("code_seat_page2_84");
        TextView t_printSeat_page2_84 = findViewById(R.id.t_printSeat_page2_84);
        t_printSeat_page2_84.setText(seat_page2_84);

        intent = getIntent();
        String seat_page2_13 = intent.getStringExtra("code_seat_page2_13");
        TextView t_printSeat_page2_13 = findViewById(R.id.t_printSeat_page2_13);
        t_printSeat_page2_13.setText(seat_page2_13);

        intent = getIntent();
        String seat_page2_33 = intent.getStringExtra("code_seat_page2_33");
        TextView t_printSeat_page2_33 = findViewById(R.id.t_printSeat_page2_33);
        t_printSeat_page2_33.setText(seat_page2_33);

        intent = getIntent();
        String seat_page2_53 = intent.getStringExtra("code_seat_page2_53");
        TextView t_printSeat_page2_53 = findViewById(R.id.t_printSeat_page2_53);
        t_printSeat_page2_53.setText(seat_page2_53);

        intent = getIntent();
        String seat_page2_73 = intent.getStringExtra("code_seat_page2_73");
        TextView t_printSeat_page2_73 = findViewById(R.id.t_printSeat_page2_73);
        t_printSeat_page2_73.setText(seat_page2_73);

        intent = getIntent();
        String seat2_page2_22 = intent.getStringExtra("code_seat_page2_22");
        TextView t_printSeat_page2_22 = findViewById(R.id.t_printSeat_page2_22);
        t_printSeat_page2_22.setText(seat2_page2_22);

        intent = getIntent();
        String seat_page2_42 = intent.getStringExtra("code_seat_page2_42");
        TextView t_printSeat_page2_42 = findViewById(R.id.t_printSeat_page2_42);
        t_printSeat_page2_42.setText(seat_page2_42);

        intent = getIntent();
        String seat_page2_62 = intent.getStringExtra("code_seat_page2_62");
        TextView t_printSeat_page2_62 = findViewById(R.id.t_printSeat_page2_62);
        t_printSeat_page2_62.setText(seat_page2_62);

        intent = getIntent();
        String seat_page2_82 = intent.getStringExtra("code_seat_page2_82");
        TextView t_printSeat_page2_82 = findViewById(R.id.t_printSeat_page2_82);
        t_printSeat_page2_82.setText(seat_page2_82);

        intent = getIntent();
        String seat_page2_11 = intent.getStringExtra("code_seat_page2_11");
        TextView t_printSeat_page2_11 = findViewById(R.id.t_printSeat_page2_11);
        t_printSeat_page2_11.setText(seat_page2_11);

        intent = getIntent();
        String seat_page2_31 = intent.getStringExtra("code_seat_page2_31");
        TextView t_printSeat_page2_31 = findViewById(R.id.t_printSeat_page2_31);
        t_printSeat_page2_31.setText(seat_page2_31);

        intent = getIntent();
        String seat_page2_51 = intent.getStringExtra("code_seat_page2_51");
        TextView t_printSeat_page2_51 = findViewById(R.id.t_printSeat_page2_51);
        t_printSeat_page2_51.setText(seat_page2_51);

        intent = getIntent();
        String seat_page2_71 = intent.getStringExtra("code_seat_page2_71");
        TextView t_printSeat_page2_71 = findViewById(R.id.t_printSeat_page2_71);
        t_printSeat_page2_71.setText(seat_page2_71);

        btn_seat1 = findViewById(R.id.btn_seat1);
        btn_seat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);

                intent.putExtra("code_seat_page1_1", "1");

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

                startActivity(intent);
            }
        });

        btn_seat2 = findViewById(R.id.btn_seat2);
        btn_seat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_2", "2");

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

                startActivity(intent);
            }
        });

        btn_seat3 = findViewById(R.id.btn_seat3);
        btn_seat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_3", "3");

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

                startActivity(intent);
            }
        });

        btn_seat4 = findViewById(R.id.btn_seat4);
        btn_seat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_4", "4");

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

                startActivity(intent);
            }
        });

        btn_seat26 = findViewById(R.id.btn_seat26);
        btn_seat26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_26", "26");

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

                startActivity(intent);
            }
        });

        btn_seat46 = findViewById(R.id.btn_seat46);
        btn_seat46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_46", "46");

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

                startActivity(intent);
            }
        });

        btn_seat66 = findViewById(R.id.btn_seat66);
        btn_seat66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_66", "66");

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

                startActivity(intent);
            }
        });

        btn_seat86 = findViewById(R.id.btn_seat86);
        btn_seat86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_86", "86");

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

                startActivity(intent);
            }
        });

        btn_seat15 = findViewById(R.id.btn_seat15);
        btn_seat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_15", "15");

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

                startActivity(intent);
            }
        });

        btn_seat35 = findViewById(R.id.btn_seat35);
        btn_seat35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_35", "35");

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

                startActivity(intent);
            }
        });

        btn_seat55 = findViewById(R.id.btn_seat55);
        btn_seat55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_55", "55");

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

                startActivity(intent);
            }
        });

        btn_seat75 = findViewById(R.id.btn_seat75);
        btn_seat75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_75", "75");

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

                startActivity(intent);
            }
        });

        btn_seat24 = findViewById(R.id.btn_seat24);
        btn_seat24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_24", "24");

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

                startActivity(intent);
            }
        });

        btn_seat44 = findViewById(R.id.btn_seat44);
        btn_seat44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_44", "44");

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

                startActivity(intent);
            }
        });

        btn_seat64 = findViewById(R.id.btn_seat64);
        btn_seat64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_64", "64");

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

                startActivity(intent);
            }
        });

        btn_seat84 = findViewById(R.id.btn_seat84);
        btn_seat84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_84", "84");

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

                startActivity(intent);
            }
        });

        btn_seat13 = findViewById(R.id.btn_seat13);
        btn_seat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_13", "13");

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

                startActivity(intent);
            }
        });

        btn_seat33 = findViewById(R.id.btn_seat33);
        btn_seat33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_33", "33");

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

                startActivity(intent);
            }
        });

        btn_seat53 = findViewById(R.id.btn_seat53);
        btn_seat53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_53", "53");

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

                startActivity(intent);
            }
        });

        btn_seat73 = findViewById(R.id.btn_seat73);
        btn_seat73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_73", "73");

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

                startActivity(intent);
            }
        });

        btn_seat22 = findViewById(R.id.btn_seat22);
        btn_seat22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_22", "22");

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

                startActivity(intent);
            }
        });

        btn_seat42 = findViewById(R.id.btn_seat42);
        btn_seat42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_42", "42");

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

                startActivity(intent);
            }
        });

        btn_seat62 = findViewById(R.id.btn_seat62);
        btn_seat62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_62", "62");

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

                startActivity(intent);
            }
        });

        btn_seat82 = findViewById(R.id.btn_seat82);
        btn_seat82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_82", "82");

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

                startActivity(intent);
            }
        });

        btn_seat11 = findViewById(R.id.btn_seat11);
        btn_seat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_11", "11");

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

                startActivity(intent);
            }
        });

        btn_seat31 = findViewById(R.id.btn_seat31);
        btn_seat31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_31", "31");

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

                startActivity(intent);
            }
        });

        btn_seat51 = findViewById(R.id.btn_seat51);
        btn_seat51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_51", "51");

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

                startActivity(intent);
            }
        });

        btn_seat71 = findViewById(R.id.btn_seat71);
        btn_seat71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(yeab_app_reserve_seat_page1.this, yeab_app_reserve_resCodePrint.class);
                intent.putExtra("code_seat_page1_71", "71");

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

                startActivity(intent);
            }
        });

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