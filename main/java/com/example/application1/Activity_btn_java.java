package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_btn_java extends AppCompatActivity {
Button button_1,button_2;//這兩個是變數 可以取跟btn同id
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_java);
        button_1=findViewById(R.id.btn_1);
        button_2=findViewById(R.id.btn_2);/*btn_2這裡是id*/
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_1.setText("已按下按鈕1:"+i+"次");
                i++;
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}