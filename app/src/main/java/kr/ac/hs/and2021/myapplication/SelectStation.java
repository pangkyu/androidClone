package kr.ac.hs.and2021.myapplication;

import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


// select_station.xml 을 위한 자바 파일
public class SelectStation extends AppCompatActivity {

    ImageView change_station;
    Button start_station, end_station;
    boolean changebtn, selected, start, end;
    String str_start, str_end;
    ImageButton btn_srt, btn_korail;
    Button select_1, select_2,select_3, select_4,select_5, select_6,select_7, select_8,select_9, select_10,select_11, select_12,select_13, select_14,select_15, select_16,select_17;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_station);

        ImageView change_station = (ImageView) findViewById(R.id.change_station);
        Button start_station = (Button) findViewById(R.id.start_station);
        Button end_station = (Button) findViewById(R.id.end_station);
        ImageButton btn_srt = (ImageButton) findViewById(R.id.btn_srt);
        ImageButton btn_korail = (ImageButton) findViewById(R.id.btn_korail);

//        // 교환섹션 이벤트 리스너
//        start_station.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                start = true;
//            }
//        });
//        end_station.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                end = true;
//            }
//        });
        change_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temporary;
                start_station.setText(str_end);
                end_station.setText(str_start);
                temporary = str_end;
                str_end = str_start;
                str_start = temporary;
            }
        });

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


        start_station.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button start_station = (Button) findViewById(R.id.start_station);

                switch (view.getId()){
                    case R.id.select_1:
                        start_station.setText("광주송정");
                        break;
                    case R.id.select_2:
                        start_station.setText("김천구미");
                        break;
                    case R.id.select_3:
                        start_station.setText("공주");
                        break;
                    case R.id.select_4:
                        start_station.setText("나주");
                        break;
                    case R.id.select_5:
                        start_station.setText("대전");
                        break;
                    case R.id.select_6:
                        start_station.setText("동대구");
                        break;
                    case R.id.select_7:
                        start_station.setText("동탄");
                        break;
                    case R.id.select_8:
                        start_station.setText("목포");
                        break;
                    case R.id.select_9:
                        start_station.setText("부산");
                        break;
                    case R.id.select_10:
                        start_station.setText("수서");
                        break;
                    case R.id.select_11:
                        start_station.setText("신경주");
                        break;
                    case R.id.select_12:
                        start_station.setText("오송");
                        break;
                    case R.id.select_13:
                        start_station.setText("울산(통도사)");
                        break;
                    case R.id.select_14:
                        start_station.setText("익산");
                        break;
                    case R.id.select_15:
                        start_station.setText("정읍");
                        break;
                    case R.id.select_16:
                        start_station.setText("평택지제");
                        break;
                    case R.id.select_17:
                        start_station.setText("천안아산");
                        break;
                }
            }
        });



    }
//
//    public void onButtonClick(View view){
//        Button start_station = (Button) findViewById(R.id.start_station);
//        switch (view.getId()){
//            case R.id.select_1:
//                start_station.setText("광주송정");
//                break;
//            case R.id.select_2:
//                start_station.setText("김천구미");
//                break;
//            case R.id.select_3:
//                start_station.setText("공주");
//                break;
//            case R.id.select_4:
//                start_station.setText("나주");
//                break;
//            case R.id.select_5:
//                start_station.setText("대전");
//                break;
//            case R.id.select_6:
//                start_station.setText("동대구");
//                break;
//            case R.id.select_7:
//                start_station.setText("동탄");
//                break;
//            case R.id.select_8:
//                start_station.setText("목포");
//                break;
//            case R.id.select_9:
//                start_station.setText("부산");
//                break;
//            case R.id.select_10:
//                start_station.setText("수서");
//                break;
//            case R.id.select_11:
//                start_station.setText("신경주");
//                break;
//            case R.id.select_12:
//                start_station.setText("오송");
//                break;
//            case R.id.select_13:
//                start_station.setText("울산(통도사)");
//                break;
//            case R.id.select_14:
//                start_station.setText("익산");
//                break;
//            case R.id.select_15:
//                start_station.setText("정읍");
//                break;
//            case R.id.select_16:
//                start_station.setText("평택지제");
//                break;
//            case R.id.select_17:
//                start_station.setText("천안아산");
//                break;
//        }
//    }
    public void onClick(View view){
        finish();
    }
}
