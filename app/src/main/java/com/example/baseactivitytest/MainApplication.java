package com.example.baseactivitytest;

import android.app.Application;

/**
 * Time: 2021/2/4
 * Author: baipenggui
 * Description:
 */
public class MainApplication extends Application {

    private static MainApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;


    }

    public static MainApplication getContext() {
        return application;
    }


}
