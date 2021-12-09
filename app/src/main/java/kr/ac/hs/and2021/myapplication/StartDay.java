//start_day.xml 을 위한 파일

package kr.ac.hs.and2021.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartDay extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_day);
    }
    public void onClick(View view){
        finish();
    }
}
