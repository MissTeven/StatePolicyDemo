package com.oaksdance.statepolicydemo.context.mecenter;

import android.content.Context;

import com.oaksdance.statepolicydemo.LoginActivity;

public class LogoutState implements UserState {
    @Override
    public void fun1(Context context) {
        LoginActivity.startAction(context);
    }

    @Override
    public void fun2(Context context) {
        LoginActivity.startAction(context);
    }
}
