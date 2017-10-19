package com.example.xjp.musicplayer.Activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by XJP on 2017/10/19.
 */
public class MusicApplication extends Application{
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();

    }

    public static Context getContext(){
        return context;
    }
}
