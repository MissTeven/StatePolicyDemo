package com.oaksdance.statepolicydemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.oaksdance.statepolicydemo.context.UserContext;
import com.oaksdance.statepolicydemo.context.main.MainUserStateController;
import com.oaksdance.statepolicydemo.context.mecenter.MecenterUserStateController;

public class MecenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecenter);
        findViewById(R.id.btn_fun1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MecenterUserStateController.sMecenterUserStateController.fun1(MecenterActivity.this);
            }
        });
        findViewById(R.id.btn_fun2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MecenterUserStateController.sMecenterUserStateController.fun2(MecenterActivity.this);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserContext.getInstance().register(MecenterUserStateController.sMecenterUserStateController);
    }

    @Override
    protected void onPause() {
        super.onPause();
        UserContext.getInstance().unregister(MecenterUserStateController.sMecenterUserStateController);
    }

    public static void startAction(Context context) {
        Intent intent = new Intent(context, MecenterActivity.class);
        context.startActivity(intent);
    }
}
