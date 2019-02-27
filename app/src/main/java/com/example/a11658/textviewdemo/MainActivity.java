package com.example.a11658.textviewdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv);
        //修改文字
        textView.setText("修改文字");
        //修改字体颜色
        textView.setTextColor(Color.BLUE);
        //修改文字大小
        textView.setTextSize(55);
        //设置文字方向
        textView.setGravity(Gravity.CENTER);
        //设置背景颜色
        textView.setBackgroundResource(R.drawable.ic_launcher_background);
    }
}
