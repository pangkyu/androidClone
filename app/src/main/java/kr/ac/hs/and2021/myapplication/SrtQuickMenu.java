package kr.ac.hs.and2021.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SrtQuickMenu extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_menu);
        ListView list = (ListView) findViewById(R.id.listview);

        String[] name = {"승차권 구매이력", "신용카드 결제내역", "회원카드", "할인쿠폰조회/등록", "회원정보변경"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, name);
        list.setAdapter(adapter);
    }


}
