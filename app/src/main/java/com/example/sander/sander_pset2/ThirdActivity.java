package com.example.sander.sander_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // process received intent
        Intent intent = getIntent();
        String receivedText = intent.getStringExtra("story");

        // edit textView based on received intent
        TextView storyView = (TextView) findViewById(R.id.storyView);
        storyView.setText(receivedText);
    }

    @Override
    public void onBackPressed() {
        Log.d("back pressed", "back pressed");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
