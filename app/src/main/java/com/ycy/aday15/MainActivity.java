package com.ycy.aday15;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ycy.aday15.bean.User;
import com.ycy.aday15.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //绑定数据
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setUserName("Rock");
        user.setPassWord("123");
        dataBinding.setUser(user);


    }
}
