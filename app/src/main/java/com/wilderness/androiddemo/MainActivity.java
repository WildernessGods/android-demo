package com.wilderness.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRecyclerFruit = findViewById(R.id.btnRecyclerFruit);
        btnRecyclerFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });
        Button btnRecyclerMsg = findViewById(R.id.btnRecyclerMsg);
        btnRecyclerMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MsgActivity.class);
                startActivity(intent);
            }
        });
        Button btnFragment = findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });
        Button btnNews = findViewById(R.id.btnNews);
        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });
    }
}