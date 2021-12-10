package kr.ac.hs.and2021.myapplication;

// 정기/회수권 섹션 자바파일

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Tickets extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_ticket);

        // footer바 이벤트
        TextView travel_menu = (TextView) findViewById(R.id.travel_menu);
        TextView tickets_main = (TextView) findViewById(R.id.tickets_main);
        TextView tickets_check = (TextView) findViewById(R.id.tickets_check);

        travel_menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showTravelGiftDialog();
            }
        });
        tickets_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CheckTicket.class);
                startActivity(intent);
            }
        });
        tickets_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }


    // 여행상품 다이얼로그를 보여주는 함수
    void showTravelGiftDialog(){
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(Tickets.this)
                .setMessage("시스템 점검 중입니다.")
                .setPositiveButton("확인", null);
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }
}
