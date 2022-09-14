package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Log in Page");
    }

    public void logMeIn(View v) {
        EditText email = findViewById(R.id.email);
        String email_text = email.getText().toString();
        EditText password = findViewById(R.id.Pass);
        String pass_text = password.getText().toString();
        if (!email_text.equals("user.leb") && !pass_text.equals("123456")) {
            Toast.makeText(getApplicationContext(), "Email and Password are wrong. Please try again", Toast.LENGTH_LONG).show();
        } else {
            if (email_text.equals("user.leb")) {
                if (pass_text.equals("123456")) {
                    Toast.makeText(getApplicationContext(), "LOGGING YOU IN!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), LandingActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong password. Use the following: 123456", Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(getApplicationContext(), "Wrong username. Use the following: user.leb", Toast.LENGTH_LONG).show();
            }

        }
    }

    
}