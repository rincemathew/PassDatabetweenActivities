package com.example.passdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText content;
    Button button;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content=findViewById(R.id.content);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take the EditText content to variable 'value'
                value=content.getText().toString();
                //start intent
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //pass the value
                intent.putExtra("PASS_VALUE", value);
                startActivity(intent);
            }
        });
    }
}
