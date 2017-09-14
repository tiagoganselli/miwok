package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.i("miwok", "Size is " + words.size());

        LinearLayout viewNumbers = (LinearLayout)findViewById(R.id.activity_numbers);

        for (int i=0; i<10; i++) {
            TextView viewWord = new TextView(this);
            viewWord.setText(words.get(i));
            viewNumbers.addView(viewWord);
        }

    }
}
