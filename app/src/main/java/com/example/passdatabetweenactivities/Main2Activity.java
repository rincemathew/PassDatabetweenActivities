package com.example.passdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textview);
        //get Intent
        Intent intent = getIntent();
        //get the value to Sting variable
        String value = intent.getStringExtra("PASS_VALUE");
        // OR
       // String value = getIntent().getStringExtra("PASS_VALUE");

        //set the value to the TextView
        textView.setText(value);
    }
}
