package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView textView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn=findViewById(R.id.button2);
        textView=(TextView) findViewById(R.id.text);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        if(b!=null){
            String j=(String)b.getString("Names");
            textView.setText(j);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSecondppage();
            }
        });

    }

    public  void moveToSecondppage(){
        Intent intent=new Intent (SecondActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}