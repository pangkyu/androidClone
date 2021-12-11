package kr.ac.hs.and2021.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

// select_station.xml 을 위한 자바 파일
public class SelectStation extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_station);
    }
    public void onClick(View view){
        finish();
    }
}
