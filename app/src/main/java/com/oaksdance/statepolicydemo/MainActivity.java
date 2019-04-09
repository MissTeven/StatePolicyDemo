package com.oaksdance.statepolicydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.oaksdance.statepolicydemo.context.UserContext;
import com.oaksdance.statepolicydemo.context.main.MainUserStateController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_fun1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainUserStateController.sMainUserStateController.fun1(MainActivity.this);
            }
        });
        findViewById(R.id.btn_fun2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainUserStateController.sMainUserStateController.fun2(MainActivity.this);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserContext.getInstance().register(MainUserStateController.sMainUserStateController);
    }

    @Override
    protected void onPause() {
        UserContext.getInstance().unregister(MainUserStateController.sMainUserStateController);
        super.onPause();
    }
}
