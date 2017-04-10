package com.ycy.aday15.bean;

import android.content.Context;

/**
 * Created by MartinYun on 2017/4/8.
 */

public class Person {

    private static final String TAG = User.class.getSimpleName();
    private String userName;

    private String passWord;
    private Context context;
    private boolean isVIP;

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
