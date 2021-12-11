package kr.ac.hs.and2021.myapplication;

import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


// select_station.xml 을 위한 자바 파일
public class SelectStation extends AppCompatActivity {

    ImageView change_station;
    TextView start_station, end_station;
    boolean changebtn, selected;
    ImageButton btn_srt, btn_korail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_station);

        ImageView change_station = (ImageView) findViewById(R.id.change_station);
        TextView start_station = (TextView) findViewById(R.id.start_station);
        TextView end_station = (TextView) findViewById(R.id.end_station);
        ImageButton btn_srt = (ImageButton) findViewById(R.id.btn_srt);
        ImageButton btn_korail = (ImageButton) findViewById(R.id.btn_korail);


        // 클릭하면 on/off 기능
        btn_srt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected == false){
                    BitmapDrawable img = (BitmapDrawable) getResources().getDrawable(R.drawable.btn_srt);
                    btn_srt.setImageDrawable(img);
                    selected = true;
                }
                else{

                    BitmapDrawable img = (BitmapDrawable) getResources().getDrawable(R.drawable.btn_srt2);
                    btn_srt.setImageDrawable(img);
                    selected = false;
                }
            }
        });
        btn_korail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected == false){
                    BitmapDrawable img = (BitmapDrawable) getResources().getDrawable(R.drawable.btn_ko2);
                    btn_korail.setImageDrawable(img);
                    selected = true;
                }
                else{

                    BitmapDrawable img = (BitmapDrawable) getResources().getDrawable(R.drawable.btn_ko);
                    btn_korail.setImageDrawable(img);
                    selected = false;
                }
            }
        });




    }
    public void onClick(View view){
        finish();
    }
}
