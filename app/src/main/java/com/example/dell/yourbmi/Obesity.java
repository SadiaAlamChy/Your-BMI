package com.example.dell.yourbmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Obesity extends AppCompatActivity {
    Button obTips;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesity);

        obTips=findViewById(R.id.btn_obesityTips);

        obTips.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Obesity.this, ObesityTips.class);
                startActivity(intent);
            }
        });




    }
}
