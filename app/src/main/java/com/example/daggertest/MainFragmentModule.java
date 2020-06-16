package com.example.daggertest;


import java.util.Random;


import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class MainFragmentModule {

//    @Provides
//    @FragmentScope
//    Integer provideInt() {
//        return  new Random().nextInt();
//    }
    @Named("fragment")
    @Provides
    @FragmentScope
    String provideString() {
        return "String from fragment";
    }
}


