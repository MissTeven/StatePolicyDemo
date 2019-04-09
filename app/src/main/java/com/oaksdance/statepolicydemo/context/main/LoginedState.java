package com.oaksdance.statepolicydemo.context.main;

import android.content.Context;

import com.oaksdance.statepolicydemo.LoginActivity;
import com.oaksdance.statepolicydemo.MecenterActivity;
import com.oaksdance.statepolicydemo.TestActivity;

public class LoginedState implements UserState {

    @Override
    public void fun1(Context context) {
        MecenterActivity.startAction(context);
    }

    @Override
    public void fun2(Context context) {
        LoginActivity.startAction(context);
    }
}
