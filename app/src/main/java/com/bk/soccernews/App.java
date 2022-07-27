package com.bk.soccernews;

import android.app.Application;

import com.bk.soccernews.ui.news.NewsViewModel;

public class App extends Application {

    private static App instance;

    public static App getInstance() {return instance;}

    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
    }

    public NewsViewModel getNews() {
        return null;
    }
}
