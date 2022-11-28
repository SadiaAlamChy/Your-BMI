package com.example.dell.yourbmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverWeight extends AppCompatActivity {
    Button oTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over_weight);

        oTips=findViewById(R.id.btn_overTips);

        oTips.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OverWeight.this, OverweightTips.class);
                startActivity(intent);
            }
        });

    }
}
