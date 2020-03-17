package com.example.androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidfunction01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FistActivity로 이동하자!
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        binding.goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              입력한 메세지를 받아서, secondActivity에 전달!
                String inputMessage = binding.inputEdt.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                인풋 메세지 변수를 "messae"라는 이름표를 붙여서 첨부.
                intent.putExtra("message", inputMessage);
                startActivity(intent);
            }
        });

    }
}
