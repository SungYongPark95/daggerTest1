package com.example.daggertest;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

//@Module(subcomponents = MainFragmentSubcomponent.class)
@Module
public abstract class MainActivityModule {

//    @Provides
//    @ActivityScope
//    String provideActivityName(){
//        return MainActivity.class.getSimpleName();
//    }
    @Named("activity")
    @Provides
    @ActivityScope
    static String provideString() {
        return "String from MainActivityModule";
    }

//    @Binds
//    @IntoMap
//    @ClassKey(MainFragment.class)
//    abstract AndroidInjector.Factory<?> bindInjectorFactory(MainFragmentSubcomponent.Factory factory);
    @FragmentScope
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragment();
}
