
package com.ycy.aday15;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ycy.aday15.bean.User;
import com.ycy.aday15.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding secondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        User person = new User();
        person.setPassWord("222");
        person.setUserName("tom");
        secondBinding.setPerson(person);


    }
}
