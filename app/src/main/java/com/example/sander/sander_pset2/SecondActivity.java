package com.example.sander.sander_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.InputStream;

public class SecondActivity extends AppCompatActivity {

    Story story;
    EditText editText;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("Activity", "SetContentView");

        // construct story
        InputStream inputStream = this.getResources().openRawResource(R.raw.madlib0_simple);
        story = new Story(inputStream);

        // set editText view
        editText = (EditText) findViewById(R.id.editText);

        Log.d("Story", "constructed and read in");
        // set initial hint to first placeholder
        editText.setHint(story.getNextPlaceholder());
    }

    public void fillIn(View view) {
    // when the submit button is clicked

        Log.d("editText", "constructed");
        String word = editText.getText().toString();
        Log.d("editText", "stored in word");

        // fill in next placeholder
        story.fillInPlaceholder(word);
        Log.d("Story", "fillInPlaceholder");

        // clear editText and set nextPlaceholder as a hint
        editText.setText("");
        editText.setHint(story.getNextPlaceholder());

        Log.d("before", "goToThird()");
        if (story.getPlaceholderRemainingCount() == 0) {
            goToThird();
        }
        Log.d("after", "goToThird()");
    }

    public void goToThird() {
    // send user to third activity

        Intent intent = new Intent(this, ThirdActivity.class);

        // wrap story into the intent
        intent.putExtra("story", story.toString());

        // start third activity and tie up loose ends
        startActivity(intent);
        finish();
    }
}