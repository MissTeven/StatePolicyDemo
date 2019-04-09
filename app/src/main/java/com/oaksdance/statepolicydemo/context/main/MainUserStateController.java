package com.oaksdance.statepolicydemo.context.main;

import android.content.Context;

import com.oaksdance.statepolicydemo.context.UserStateController;

public class MainUserStateController implements UserStateController, UserState {
    private UserState mUserState;

    private MainUserStateController() {
    }

    public static final MainUserStateController sMainUserStateController = new MainUserStateController();

    @Override
    public void exited() {
        setUserState(new LogoutState());
    }

    @Override
    public void logined() {
        setUserState(new LoginedState());
    }

    public void setUserState(UserState userState) {
        mUserState = userState;
    }

    @Override
    public void fun1(Context context) {
        mUserState.fun1(context);
    }

    @Override
    public void fun2(Context context) {
        mUserState.fun2(context);
    }
}
