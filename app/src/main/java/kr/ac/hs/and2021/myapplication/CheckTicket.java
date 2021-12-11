// 승차권 확인 페이지(자바)

package kr.ac.hs.and2021.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CheckTicket  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_ticket);

        // footer바 이벤트
        TextView check_1 = (TextView) findViewById(R.id.check_1);
        TextView check_3 = (TextView) findViewById(R.id.check_3);
        TextView check_4 = (TextView) findViewById(R.id.check_4);

        check_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showTravelGiftDialog();
            }
        });
        check_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tickets.class);
                startActivity(intent);
            }
        });
        check_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    // 여행상품 다이얼로그를 보여주는 함수
    void showTravelGiftDialog(){
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(CheckTicket.this)
                .setMessage("시스템 점검 중입니다.")
                .setPositiveButton("확인", null);
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }
}
