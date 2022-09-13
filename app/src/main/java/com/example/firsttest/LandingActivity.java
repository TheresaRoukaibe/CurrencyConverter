package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        double lbpVal = Double.parseDouble(lbp_value);
        if(lbp_value.isEmpty()){
            Toast.makeText(getApplicationContext(), "PLease enter value", Toast.LENGTH_LONG).show();
        }else{
            double newVal = lbpVal/40000;
            message=Toast.makeText(getApplicationContext(), lbp_value+ " in USD is: " + newVal + " $", Toast.LENGTH_LONG);
            message.show();
        }


    }

    public void convertToLBP(View v){
        Toast message;
        String usd_value = USD.getText().toString();
        double usdVal = Double.parseDouble(usd_value);
        if(usd_value.isEmpty()){
            Toast.makeText(getApplicationContext(), "PLease enter value", Toast.LENGTH_LONG).show();
        }else{
            double newVal = usdVal*40000;
            message=Toast.makeText(getApplicationContext(), usd_value+ " in LBP is: " + newVal + " L.L.", Toast.LENGTH_LONG);
            message.show();
        }
    }

}