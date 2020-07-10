package com.wilderness.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

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
        Button btnBroadcast = findViewById(R.id.btnBroadcast);
        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BroadcastActivity.class);
                startActivity(intent);
            }
        });
        Button btnMyBroadcast = findViewById(R.id.btnMyBroadcast);
        btnMyBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.wilderness.androiddemo.broadcast.MY_BROADCAST");
                sendOrderedBroadcast(intent, null);
            }
        });
        Button btnForceOffline = findViewById(R.id.btnForceOffline);
        btnForceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.wilderness.androiddemo.broadcast.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
        Button btnFile = findViewById(R.id.btnFile);
        btnFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FileActivity.class);
                startActivity(intent);
            }
        });
        Button btnDatabase = findViewById(R.id.btnDatabase);
        btnDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DatabaseActivity.class);
                startActivity(intent);
            }
        });
        Button btnRuntimePermission = findViewById(R.id.btnRuntimePermission);
        btnRuntimePermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RuntimePermissionMainActivity.class);
                startActivity(intent);
            }
        });
    }
}