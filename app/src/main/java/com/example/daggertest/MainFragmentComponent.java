package com.example.daggertest;

import dagger.BindsInstance;
import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = MainFragmentModule.class)
public interface MainFragmentComponent {

    void inject(MainFragment mainFragment);

    @Subcomponent.Builder
    interface  Builder {
        MainFragmentComponent.Builder setModule(MainFragmentModule module);
        @BindsInstance
        MainFragmentComponent.Builder setFragment(MainFragment fragment);
        MainFragmentComponent build();
    }

//    @Subcomponent.Factory
//    interface Factory {
//        MainFragmentComponent create(@BindsInstance MainFragment fragment,
//                                     MainFragmentModule module);
//    }
}
