package com.example.dell.yourbmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Healthy extends AppCompatActivity {
    TextView tvh,tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        tvh=findViewById(R.id.tv_h);
        tv=findViewById(R.id.bmi_show);
        st=getIntent().getExtras().getString("value");
        tv.setText(st);

    }
}
