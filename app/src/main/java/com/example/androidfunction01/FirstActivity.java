package com.example.androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.androidfunction01.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {

    ActivityFirstBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first);

        binding.finishFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                다시 메인화면으로 복귀.
//                    복귀 : 지금 보는 화면을 종료!
                finish();
            }
        });

    }
}
