package com.ycy.aday15.bean;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ycy.aday15.SecondActivity;

/**
 * Created by MartinYun on 2017/4/8.
 */

public class User {

    private static final String TAG = User.class.getSimpleName();
    private String userName;

    private String passWord;
    private Context context;

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

//    public void login(View view){
//        Log.e(TAG, "login: "+userName +"==="+passWord );
//
//        Toast.makeText(view.getContext(),"登录操作",Toast.LENGTH_SHORT).show();
//
//        view.getContext().startActivity(new Intent(view.getContext(), SecondActivity.class));
//    }

    public void login(){

        context.startActivity(new Intent(context,SecondActivity.class));
    }
}
