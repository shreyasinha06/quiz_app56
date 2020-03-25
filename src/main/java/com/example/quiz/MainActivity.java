package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    private Button button;
    EditText ed1,ed2,ed3;
    String s1,s2,s3,s4;
    Bundle bn = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonAlert);

        ed1= (EditText) findViewById(R.id.t1);
        ed2= (EditText) findViewById(R.id.t2);
        ed3= (EditText) findViewById(R.id.t3);







// add button listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder alertDialogBuilder = new

                        AlertDialog.Builder(

                        context);

                s1=String.valueOf(ed1.getText());
                s2=String.valueOf(ed2.getText());
                s3=String.valueOf(ed3.getText());
// set title
                alertDialogBuilder.setTitle("DO YOU WANT TO CONTINUE");
// set dialog message
                alertDialogBuilder.setMessage("Click yes to continue!");
                alertDialogBuilder.setCancelable(false);

                alertDialogBuilder.setPositiveButton("Yes", new

                        DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(MainActivity.this, resultant.class);
                                bn.putString("v1",s1);
                                bn.putString("v2",s2);
                                bn.putString("v3",s3);
                                intent.putExtras(bn);
                                startActivity(intent);
// if this button is clicked, close
// current activity
                            }
                        });
                alertDialogBuilder.setNegativeButton("No", new

                        DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {

// if this button is clicked, just close
// the dialog box and do nothing
                                dialog.cancel();
                            }
                        });
                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
// show it
                alertDialog.show();
            }
        });

    }

}


