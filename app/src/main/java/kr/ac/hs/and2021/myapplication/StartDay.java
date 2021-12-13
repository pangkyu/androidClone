//start_day.xml 을 위한 파일

package kr.ac.hs.and2021.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartDay extends AppCompatActivity {

    CalendarView view_startcal;
    Button start_select;
    TextView time11, time12, time13, time14, time15, time16, time17, time18, time19, time20, time21, time22, time23;
    TextView time0, time1, time2, time3, time4, time5, time6, time7, time8, time9, time10, after_hour;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_day);


        start_select = (Button) findViewById(R.id.start_select);
        view_startcal = (CalendarView)findViewById(R.id.view_startcal);
        time0 = (TextView) findViewById(R.id.time0);
        time1 = (TextView) findViewById(R.id.time1);
        time2 = (TextView) findViewById(R.id.time2);
        time3 = (TextView) findViewById(R.id.time3);
        time4 = (TextView) findViewById(R.id.time4);
        time5 = (TextView) findViewById(R.id.time5);
        time6 =(TextView)  findViewById(R.id.time6);
        time7 = (TextView) findViewById(R.id.time7);
        time8 = (TextView) findViewById(R.id.time8);
        time9 = (TextView) findViewById(R.id.time9);
        time10 = (TextView) findViewById(R.id.time10);
        time11 = (TextView) findViewById(R.id.time11);
        time12 = (TextView) findViewById(R.id.time12);
        time13 = (TextView) findViewById(R.id.time13);
        time14 = (TextView) findViewById(R.id.time14);
        time15 = (TextView) findViewById(R.id.time15);
        time16 = (TextView) findViewById(R.id.time16);
        time17 = (TextView) findViewById(R.id.time17);
        time18 = (TextView) findViewById(R.id.time18);
        time19 = (TextView) findViewById(R.id.time19);
        time20 = (TextView) findViewById(R.id.time20);
        time21 =(TextView)  findViewById(R.id.time21);
        time22 = (TextView) findViewById(R.id.time22);
        time23 = (TextView) findViewById(R.id.time23);
        after_hour = (TextView) findViewById(R.id.after_hour);

        final int[] hours = new int[24];
        time0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[0] = 0;
                after_hour.setText(Integer.toString(hours[0]));
            }
        });
        time1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[1] = 1;
                after_hour.setText(Integer.toString(hours[1]));
            }
        });
        time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[2] = 2;
                after_hour.setText(Integer.toString(hours[2]));
            }
        });
        time3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[3] = 3;
                after_hour.setText(Integer.toString(hours[3]));
            }
        });
        time4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[4] = 4;
                after_hour.setText(Integer.toString(hours[4]));
            }
        });
        time5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[5] = 5;
                after_hour.setText(Integer.toString(hours[5]));
            }
        });
        time6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[6] = 6;
                after_hour.setText(Integer.toString(hours[6]));
            }
        });
        time7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[7] = 7;
                after_hour.setText(Integer.toString(hours[7]));
            }
        });
        time8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[8] = 8;
                after_hour.setText(Integer.toString(hours[8]));
            }
        });
        time9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[9] = 9;
                after_hour.setText(Integer.toString(hours[9]));
            }
        });
        time10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[10] = 10;
                after_hour.setText(Integer.toString(hours[10]));
            }
        });
        time11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[11] = 11;
                after_hour.setText(Integer.toString(hours[11]));
            }
        });
        time12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[12] = 12;
                after_hour.setText(Integer.toString(hours[12]));
            }
        });
        time13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[13] = 13;
                after_hour.setText(Integer.toString(hours[13]));
            }
        });
        time14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[14] = 14;
                after_hour.setText(Integer.toString(hours[14]));
            }
        });
        time15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[15] = 15;
                after_hour.setText(Integer.toString(hours[15]));
            }
        });
        time16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[16] = 16;
                after_hour.setText(Integer.toString(hours[16]));
            }
        });
        time17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[17] = 17;
                after_hour.setText(Integer.toString(hours[17]));
            }
        });
        time18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[18] = 18;
                after_hour.setText(Integer.toString(hours[18]));
            }
        });

        time19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[19] = 19;
                after_hour.setText(Integer.toString(hours[19]));
            }
        });
        time20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[20] = 20;
                after_hour.setText(Integer.toString(hours[20]));
            }
        });
        time21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[21] = 21;
                after_hour.setText(Integer.toString(hours[21]));
            }
        });

        time22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[22] = 22;
                after_hour.setText(Integer.toString(hours[22]));
            }
        });

        time23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hours[23] = 23;
                after_hour.setText(Integer.toString(hours[23]));
            }
        });

        



    }



    public void onClick(View view){
        finish();
    }


}
