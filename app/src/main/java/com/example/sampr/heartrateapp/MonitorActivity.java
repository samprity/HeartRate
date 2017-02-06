package com.example.sampr.heartrateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MonitorActivity extends AppCompatActivity {
    private TextView alertText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        Intent intent = getIntent();
        String cardioZone = intent.getStringExtra("cardioZone");
        alertText = (TextView)findViewById(R.id.alertText);
        alertText.setText("Cardio Zone : " + cardioZone);
    }

}
