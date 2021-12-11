package kr.ac.hs.and2021.myapplication;

import android.app.Activity;
import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quick_menu);

        String[] title = {"승차권 구매이력", "신용카드 결제내역", "회원카드","할인쿠폰조회/등록","회원 정보조회/변경"};

        ListView list = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,title);
        list.setAdapter(adapter);



    }
    public void onClick(View view){
        finish();
    }


}
