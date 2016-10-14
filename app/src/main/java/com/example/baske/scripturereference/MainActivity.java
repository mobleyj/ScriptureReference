package com.example.baske.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    EditText getBook;
    EditText getChap;
    EditText getVerse;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getBook = (EditText) findViewById(R.id.book);
        getChap = (EditText) findViewById(R.id.chapter);
        getVerse = (EditText) findViewById(R.id.verse);

        btnSubmit = (Button) findViewById(R.id.button);
        btnSubmit.setOnClickListener(this);

    }

    //@Override
    public void onClick(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("book", getBook.getText().toString());
        intent.putExtra("chapter", getChap.getText().toString());
        intent.putExtra("verse", getVerse.getText().toString());

        startActivity(intent);

    }
}
