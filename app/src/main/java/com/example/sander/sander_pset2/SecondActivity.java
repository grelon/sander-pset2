package com.example.sander.sander_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.sander.sander_pset2.R.id.textView2;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // while placeholder are not filled in
            // prepare text from input
            EditText intentText = (EditText) findViewById(R.id.intentText);
            String text = intentText.getText().toString();

            // submit text to input text array
            // button

        // wrap input text array in intent and send it to Third Activity
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("ourText", text);

    }
}
