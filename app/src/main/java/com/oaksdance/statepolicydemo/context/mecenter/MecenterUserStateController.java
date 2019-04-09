package com.oaksdance.statepolicydemo.context.mecenter;

import android.content.Context;

import com.oaksdance.statepolicydemo.context.UserStateController;

public class MecenterUserStateController implements UserStateController, UserState {
    private UserState mUserState;

    private MecenterUserStateController() {
    }

    public static final MecenterUserStateController sMecenterUserStateController = new MecenterUserStateController();

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
