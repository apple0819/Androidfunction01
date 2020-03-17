package com.example.androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.example.androidfunction01.databinding.ActivityMainBinding;
import com.example.androidfunction01.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        String sendMessage = getIntent().getStringExtra("message");

        Log.d("받아온string", sendMessage);

        binding.messageTxt.setText(sendMessage);
    }
}
