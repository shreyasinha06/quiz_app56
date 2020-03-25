package com.example.quiz;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultant extends AppCompatActivity {

    TextView text1,text2,text3,text4;
    String s11,s22,s33,ans1,ans2,ans3;
    int c=0;
    Bundle b = new Bundle();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultant);
        text1=findViewById(R.id.textView4);
        text2=findViewById(R.id.textView5);
        text3=findViewById(R.id.textView9);
        text4=findViewById(R.id.textView12);
        b=getIntent().getExtras();
        s11=b.getString("v1");
        s22=b.getString("v2");
        s33=b.getString("v3");
        ans1="delhi";
        ans2="kovind";
        ans3="modi";
        if(ans1.equalsIgnoreCase(s11))
            c++;
        if(ans2.equalsIgnoreCase(s22))
            c++;
        if(ans3.equalsIgnoreCase(s33))
            c++;
        int k=c;
        String p=String.valueOf(k);

        text1.setText(s11);
        text2.setText(s22);
        text3.setText(s33);
        text4.setText(p);


    }
}
