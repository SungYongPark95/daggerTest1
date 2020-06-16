package com.example.daggertest;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.fragment.app.Fragment;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;

//public class MainFragment extends Fragment {
public class MainFragment extends DaggerFragment {
//    @Inject
//    SharedPreferences sharedPreferences;
//
//    @Inject
//    String activityName;
//
//    @Inject
//    Integer randomNumber;
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if(getActivity() instanceof MainActivity){
//            ((MainActivity) getActivity()).getComponent()
//                    .mainFragmentComponentBuilder()
//                    .setModule(new MainFragmentModule())
//                    .setFragment(this)
//                    .build()
//                    .inject(this);
//        }
//
//        Log.d("MainFragment", activityName);
//        Log.d("MainFragment", "randomNumber = "+randomNumber);
//    }
    @Inject
    @Named("app")
    String appString;

    @Inject
    @Named("activity")
    String activityString;

    @Inject
    @Named("fragment")
    String fragmentString;

    @Override
    public void onAttach(Context context){
        AndroidSupportInjection.inject(this);
        Log.e("MainFragment", appString);
        Log.e("MainFragment", activityString);
        Log.e("MainFragment", fragmentString);
        super.onAttach(context);
    }
}