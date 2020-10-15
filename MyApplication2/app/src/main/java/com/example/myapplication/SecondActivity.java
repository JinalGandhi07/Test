package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView=(TextView) findViewById(R.id.text);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        if(b!=null){
            String j=(String)b.getString("Names");
            textView.setText(j);
        }

    }
}