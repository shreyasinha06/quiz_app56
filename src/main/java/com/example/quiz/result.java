package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView text1,text2,text3;
    String s11,s22,s33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        text1=findViewById(R.id.textView6);
        text2=findViewById(R.id.textView7);
        text3=findViewById(R.id.textView8);

        s11=getIntent().getStringExtra("v1");
        s22=getIntent().getStringExtra("v2");
        s33=getIntent().getStringExtra("v3");

        text1.setText(s11);
        text2.setText(s22);
        text3.setText(s33);

    }
}
