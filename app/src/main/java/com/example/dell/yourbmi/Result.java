package com.example.dell.yourbmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    TextView tv;
    String st;
    Button tips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv=findViewById(R.id.bmi_show);
        tips=findViewById(R.id.underweight_tips);

        st=getIntent().getExtras().getString("value");
        tv.setText(st);

        tips.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Result.this,UnderweightTips.class);
                startActivity(intent);

            }
        });


    }
}
