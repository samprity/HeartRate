package com.example.sampr.heartrateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void monitorButtonHandler(View view) {
        Intent intent = new Intent(MainActivity.this, MonitorActivity.class);
        intent.putExtra("cardioZone", "135");
        intent.putExtra("fatBurnZone", "110");
        intent.putExtra("customeZone", "89");
        MainActivity.this.startActivity(intent);
    }

    public void submitButtonHandler(View view) {
        Intent intent = new Intent(MainActivity.this, SubmitActivity.class);
        MainActivity.this.startActivity(intent);
    }
}
