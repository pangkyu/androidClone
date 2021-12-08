package kr.ac.hs.and2021.myapplication;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class SrtQuickMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_menu);

        ListView listview;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

        //리스트뷰 참조 및 Adapter 닫기
        listview = (ListView) findViewById(R.id.listview);

        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.next), "승차권 구매이력", "3개월 이내 내역 조회 가능");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.next), "신용카드 결제내역", "");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.next), "회원카드", "회원 QR코드");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.next), "할인쿠폰조회/등록", "고객할인 쿠폰을 조회 하세요");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.next), "회원 정보조회/변경", "");
    }


//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.quick_menu);
//        ListView list = (ListView) findViewById(R.id.listview);
//
//        String[] name = {"승차권 구매이력", "신용카드 결제내역", "회원카드", "할인쿠폰조회/등록", "회원정보변경"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);
//        list.setAdapter(adapter);
//    }


}
