package com.example.daggertest;

import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

//    public class App extends Application implements HasAndroidInjector
public class App extends DaggerApplication {
//    private AppComponent appComponent;
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        appComponent = DaggerAppComponent.factory()
//                .create(this, new AppModule());
//
//    }
//
//    public AppComponent getAppComponent() {
//        return appComponent;
//    }

//    @Inject
//    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        DaggerAppComponent.factory()
//                .create(this)
//                .inject(this);
//    }

//    @Override
//    public AndroidInjector<Object> androidInjector() {
//        return dispatchingAndroidInjector;
//    }
    @Override
    protected AndroidInjector<? extends DaggerApplication>
    applicationInjector() {
        return DaggerAppComponent.factory()
                .create(this);
    }
}
