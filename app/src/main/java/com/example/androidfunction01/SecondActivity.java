package com.example.androidfunction01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.androidfunction01.databinding.ActivityMainBinding;

public class SecondActivity extends AppCompatActivity {

    ActivityMainBinding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String sendMessage = getIntent().getStringExtra("message");

        Log.d("받아온string", sendMessage);
    }
}
