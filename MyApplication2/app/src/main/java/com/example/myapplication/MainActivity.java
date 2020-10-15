package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSecondppage();
            }
        });
    }

public  void moveToSecondppage(){
    Intent intent=new Intent (MainActivity.this,SecondActivity.class);
    String[] names=getResources().getStringArray(R.array.name);
    Random rand =new Random();
    int n=rand.nextInt(names.length);
    String randomename=names[n];
    intent.putExtra("Names",randomename) ;
    startActivity(intent);
    finish();
}
}