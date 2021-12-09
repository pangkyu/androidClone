// quick_menu.xml 을 위한 리스트뷰 자바 파일


package kr.ac.hs.and2021.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SrtQuickMenu extends AppCompatActivity {

    ListView listView;
    ListItemAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_menu);

        listView = findViewById(R.id.listview);
        adapter = new ListItemAdapter();



        adapter.addItem(new ListItem("승차권 구매이력", "3개월 이내 내역 조회 가능"));
        adapter.addItem(new ListItem("신용카드 결제내역", ""));
        adapter.addItem(new ListItem("회원카드", "회원 QR코드"));
        adapter.addItem(new ListItem("할인쿠폰조회/등록", "고객할인 쿠폰을 조회 하세요" ));
        adapter.addItem(new ListItem("회원 정보조회/변경", ""));

    }
    public void onClick(View view){
        finish();
    }
}
