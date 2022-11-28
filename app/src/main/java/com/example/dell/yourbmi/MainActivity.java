package com.example.dell.yourbmi;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.dell.yourbmi.R.raw.click_continue;

public class MainActivity extends AppCompatActivity {
    EditText weight, feet, inch;
    Button calculate;
    TextView eyh,result;
    double fee,inc,weigh,resul,hig;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight=findViewById(R.id.et_weight);
        feet=findViewById(R.id.et_feet);
        inch=findViewById(R.id.et_inch);
        calculate=findViewById(R.id.btn_calculate);
        eyh=findViewById(R.id.tv_eyh);
        result=findViewById(R.id.tv_result);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click_continue);

        calculate.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                fee=Double.parseDouble(feet.getText().toString().trim());
                inc=Double.parseDouble(inch.getText().toString().trim());
                weigh=Double.parseDouble(weight.getText().toString().trim());

                hig=(((fee*12)+inc)*0.0254);
                resul=weigh/(hig*hig);
                result.setText(String.valueOf(resul));
                mp.start();

                if(resul<18.5) {
                    Intent intent = new Intent(MainActivity.this, Result.class);
                    st = result.getText( ).toString( );
                    intent.putExtra("value", st);
                    startActivity(intent);

                }
                else if(resul>18.51 && resul<24.90)
                {
                    Intent intent=new Intent(MainActivity.this,Healthy.class);
                    st = result.getText( ).toString( );
                    intent.putExtra("value", st);
                    startActivity(intent);
                }
                else if(resul>24.89 && resul<30)
                {
                    Intent intent=new Intent(MainActivity.this,OverWeight.class);
                    startActivity(intent);
                }
                else if(resul>30)
                {
                    Intent intent=new Intent(MainActivity.this,Obesity.class);
                    startActivity(intent);


                }
                else
                    Toast.makeText(MainActivity.this, "Please give the required infomation.", Toast.LENGTH_LONG).show( );


            }
        });




    }
}
