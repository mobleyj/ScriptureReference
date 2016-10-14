package com.example.baske.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        output = (TextView) findViewById(R.id.output);

        Intent intent = getIntent();

        String book = intent.getStringExtra("book");
        String chapter = intent.getStringExtra("chapter");
        String verse = intent.getStringExtra("verse");

        output.setText("Your favorite scripture is: " + book + " " + chapter + ": " + verse + ".");

    }

}
