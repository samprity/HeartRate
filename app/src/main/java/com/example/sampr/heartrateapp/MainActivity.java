package com.example.sampr.heartrateapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void monitorButtonHandler(View view) {
        Intent myIntent = new Intent(MainActivity.this, AlertActivity.class);
        myIntent.putExtra("cardioZone", "135");
        myIntent.putExtra("fatBurnZone", "110");
        myIntent.putExtra("customeZone", "89");
        MainActivity.this.startActivity(myIntent);
    }
}
