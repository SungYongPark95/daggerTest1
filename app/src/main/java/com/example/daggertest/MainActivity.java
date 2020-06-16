package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;

//public class MainActivity extends AppCompatActivity implements HasAndroidInjector {
public class MainActivity extends DaggerAppCompatActivity{

//    @Inject
//    DispatchingAndroidInjector<Object> androidInjector;

    @Inject
    @Named("app")
    String appString;

    @Inject
    @Named("activity")
    String activityString;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        AndroidInjection.inject(this);
        Log.e("MainActivity", appString);
        Log.e("MainActivity", activityString);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MainFragment())
                .commit();
    }
//    @Override
//    public AndroidInjector<Object> androidInjector() {
//        return androidInjector;
//    }
//    @Inject
//    SharedPreferences sharedPreferences;
//
//    @Inject
//    String activityName;
//    MainActivityComponent component;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        component = ((App)getApplication()).getAppComponent()
//                .mainActivityComponentBuilder()
//                .setModule(new MainActivityModule())
//                .setActivity(this)
//                .build();
//        component.inject(this);
//
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.container, new MainFragment())
//                .commit();
//    }
//
//    public MainActivityComponent getComponent() {
//        return component;
//    }
}
