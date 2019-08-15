package com.outerspacebar.nihongosempai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView txMain;
    Button btnStart;
    CheckBox cb0100, cb0200, cb0300, cb0400, cb0500, cb0600, cb0700, cb0800, cb0900, cb1000;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        cb0100 = findViewById(R.id.cb0100);
        cb0200 = findViewById(R.id.cb0200);
        cb0300 = findViewById(R.id.cb0300);
        cb0400 = findViewById(R.id.cb0400);
        cb0500 = findViewById(R.id.cb0500);
        cb0600 = findViewById(R.id.cb0600);
        cb0700 = findViewById(R.id.cb0700);
        cb0800 = findViewById(R.id.cb0800);
        cb0900 = findViewById(R.id.cb0900);
        cb1000 = findViewById(R.id.cb1000);


        btnStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });


    }
}

