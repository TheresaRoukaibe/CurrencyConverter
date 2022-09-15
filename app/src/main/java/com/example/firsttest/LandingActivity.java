package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class LandingActivity extends AppCompatActivity {
    public TextView USD;
    public TextView LBP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        getSupportActionBar().setTitle("Currency Converter");
        USD = findViewById(R.id.USD_am);
        LBP = findViewById(R.id.LBP_am);
    }

    public void convertToUSD(View v){
        Toast message;
        String lbp_value = LBP.getText().toString();
        try {
            double lbpVal = Double.parseDouble(lbp_value);
            double newVal = lbpVal/40000;
            message=Toast.makeText(getApplicationContext(), lbp_value+ " L.L. in USD is: " + newVal + " $", Toast.LENGTH_LONG);
            message.show();
        }catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Please input value in L.L.", Toast.LENGTH_LONG).show();
        }

        }



    public void convertToLBP(View v){
        Toast message;
        String usd_value = USD.getText().toString();
        try {
            double usdVal = Double.parseDouble(usd_value);
            double newVal = usdVal*40000;
            message=Toast.makeText(getApplicationContext(), usd_value+ " $ in LBP is: " + newVal + " L.L.", Toast.LENGTH_LONG);
            message.show();
        }catch(NumberFormatException e){
            Toast.makeText(getApplicationContext(), "PLease input value in $", Toast.LENGTH_LONG).show();
        }

        }

}