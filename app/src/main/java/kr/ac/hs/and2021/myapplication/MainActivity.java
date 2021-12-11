package kr.ac.hs.and2021.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private TextView type1, type2, type3, type4, type5, type6;
    private Button type1_minus, type1_plus, type2_minus, type2_plus, type3_minus, type3_plus, type4_minus, type4_plus, type5_minus, type5_plus, type6_minus, type6_plus;
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private int count4 = 0;
    private int count5 = 0;
    private int count6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 메인페이지 헤더 버튼 이벤트
        ImageButton header_button= (ImageButton)findViewById(R.id.header_button);
        ImageButton btn_chatbot = (ImageButton)findViewById(R.id.btn_chatbot);

        header_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), List.class);
                startActivity(intent);
            }
        });
        btn_chatbot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showChatbotDialog();
            }
        });

        // 출발일 intent 보내는 이벤트리스너
        LinearLayout select_start_day = (LinearLayout) findViewById(R.id.select_start_day);

        select_start_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StartDay.class);
                startActivity(intent);

            }
        });

        // 푸터바 이벤트 리스너
        TextView main_travel = (TextView) findViewById(R.id.main_travel);
        TextView main_tickets = (TextView) findViewById(R.id.main_tickets);
        TextView main_check = (TextView) findViewById(R.id.main_check);

        main_tickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tickets.class);
                startActivity(intent);
            }
        });

        main_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckTicket.class);
                startActivity(intent);
            }
        });

        main_travel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showTravelDialog();
            }
        });

        // 출발 / 왕복 섹션 이벤트 리스너
        Button start_section = (Button) findViewById(R.id.start_section);
        Button end_section = (Button) findViewById(R.id.end_section);

        start_section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectStation.class);
                startActivity(intent);
            }
        });
        end_section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SelectStation.class);
                startActivity(intent);
            }
        });


        // 인원수 +, - 섹션
        type1_minus = (Button) findViewById(R.id.type1_minus);
        type1_plus = (Button) findViewById(R.id.type1_plus);
        type2_minus = (Button)findViewById(R.id.type2_minus);
        type2_plus = (Button)findViewById(R.id.type2_plus);
        type3_minus = (Button)findViewById(R.id.type3_minus);
        type3_plus =(Button) findViewById(R.id.type3_plus);
        type4_minus = (Button)findViewById(R.id.type4_minus);
        type4_plus = (Button)findViewById(R.id.type4_plus);
        type5_minus = (Button)findViewById(R.id.type5_minus);
        type5_plus = (Button)findViewById(R.id.type5_plus);
        type6_minus = (Button)findViewById(R.id.type6_minus);
        type6_plus = (Button)findViewById(R.id.type6_plus);
        type1 = (TextView)findViewById(R.id.type1);
        type2 = (TextView)findViewById(R.id.type2);
        type3 = (TextView)findViewById(R.id.type3);
        type4 = (TextView)findViewById(R.id.type4);
        type5 = (TextView)findViewById(R.id.type5);
        type6 = (TextView)findViewById(R.id.type6);

        type1_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count1++;
                type1.setText(count1+"");
            }
        });
        type1_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count1>0){
                count1--;
                type1.setText(count1+"");

                }
            }
        });

        type2_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count2++;
                type2.setText(count2+"");
            }
        });
        type2_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count2>0){
                    count2--;
                    type2.setText(count2+"");
                }
            }
        });
        type3_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count3++;
                type3.setText(count3+"");
            }
        });
        type3_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count3>0) {
                    count3--;
                    type3.setText(count3 + "");
                }
            }
        });
        type4_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count4++;
                type4.setText(count4+"");
            }
        });
        type4_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count4>0){
                    count4--;
                    type4.setText(count4+"");
                }

            }
        });

        type5_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count5++;
                type5.setText(count5+"");
            }
        });
        type5_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count5>0){
                    count5--;
                    type5.setText(count5+"");
                }
            }
        });

        type6_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count6++;
                type6.setText(count6+"");
            }
        });
        type6_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count6>0){
                    count6--;
                    type6.setText(count6+"");
                }
            }
        });
    }

    // srt챗봇 메시지를 보여주는 함수
    void showChatbotDialog(){
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(MainActivity.this)
                .setMessage("SRT 챗봇은 카카오톡 기반의 고객 안내 서비스입니다.\n" +
                        "상담원 연결이 필요한 고객님께서는 SR 고객센터(1800-1472)를 이용해주십시오.\n" +
                        "SRT 챗봇으로 이동하시겠습니까?")
                .setPositiveButton("예", null)
                .setNeutralButton("아니오", null);
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }

    // 푸터바 여행상품 다이얼로그를 보여주는 함수
    void showTravelDialog(){
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(MainActivity.this)
                .setMessage("시스템 점검중입니다.")
                .setPositiveButton("확인", null);
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }


}