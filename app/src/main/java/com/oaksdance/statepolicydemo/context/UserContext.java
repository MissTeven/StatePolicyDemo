package com.oaksdance.statepolicydemo.context;

import java.util.ArrayList;
import java.util.List;

public class UserContext {
    private List<UserStateController> mUserStateControllers;
    private static final int STATE_LOGIN = 1;
    private static final int STATE_LOGOUT = 2;
    private int mCurrentState = STATE_LOGOUT;

    private UserContext() {
        mUserStateControllers = new ArrayList<>();
    }

    public static UserContext getInstance() {
        return UserContextHolder.sUserContext;
    }

    public void register(UserStateController userStateController) {
        switch (mCurrentState) {
            case STATE_LOGIN:
                userStateController.logined();
                break;
            case STATE_LOGOUT:
                userStateController.exited();
                break;
        }
        if (!mUserStateControllers.contains(userStateController)) {
            mUserStateControllers.add(userStateController);
        }
    }

    public void unregister(UserStateController userStateController) {
        mUserStateControllers.remove(userStateController);
    }

    public void exit() {
        mCurrentState = STATE_LOGOUT;
        for (UserStateController item : mUserStateControllers) {
            item.exited();
        }
    }

    public void login() {
        mCurrentState = STATE_LOGIN;
        for (UserStateController item : mUserStateControllers) {
            item.logined();
        }
    }

    private static class UserContextHolder {
        private static final UserContext sUserContext = new UserContext();
    }
}
