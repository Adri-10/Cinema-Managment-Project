package com.example.cinema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button WATCH1,WATCH2,WATCH3,WATCH4,WATCH5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        WATCH1 = (Button) findViewById(R.id.btnWatch1);
        WATCH2 = (Button) findViewById(R.id.btnWatch3);
        WATCH3 =(Button) findViewById(R.id.btnWatch4);
        WATCH4 =(Button) findViewById(R.id.btnWatch5);
        WATCH5 =(Button) findViewById(R.id.btnWatch6);

        WATCH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(in1);
            }
        });

        WATCH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(in2);

            }
        });
        WATCH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(SecondActivity.this,FifthActivity.class);
                startActivity(in3);

            }
        });
        WATCH4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(SecondActivity.this,SixthActivity.class);
                startActivity(in4);
            }
        });
        WATCH5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(SecondActivity.this,SeventhActivity.class);
                startActivity(in5);
            }
        });


    }
}
