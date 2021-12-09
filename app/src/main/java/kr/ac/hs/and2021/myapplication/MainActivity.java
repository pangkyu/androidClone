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

public class MainActivity extends AppCompatActivity {

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
                Intent intent = new Intent(getApplicationContext(), SrtQuickMenu.class);
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
        main_travel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showTravelDialog();
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