package com.oaksdance.statepolicydemo.context.mecenter;

import android.content.Context;

import com.oaksdance.statepolicydemo.Test2Activity;
import com.oaksdance.statepolicydemo.TestActivity;

public class LoginedState implements UserState {
    @Override
    public void fun1(Context context) {
        TestActivity.startAction(context);
    }

    @Override
    public void fun2(Context context) {
        Test2Activity.startAction(context);
    }
}
