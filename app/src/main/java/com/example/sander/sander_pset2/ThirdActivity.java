package com.example.sander.sander_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // process received intent
        Intent intent = getIntent();
        String receivedText = intent.getStringExtra("ourText");

        // edit textView based on received intent
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(receivedText);
    }
}
