package com.mark.chat.lambcommunication.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.mark.chat.lambcommunication.R;

/**
 * Created by mark on 2016/7/11.
 */
public class WelcomeUI extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ui_welcome);
    }
}
