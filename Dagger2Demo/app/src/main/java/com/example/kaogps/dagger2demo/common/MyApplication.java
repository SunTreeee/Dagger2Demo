package com.example.kaogps.dagger2demo.common;

import android.app.Application;
import android.location.LocationManager;

import com.example.kaogps.dagger2demo.presentation.dagger2.component.ApplicationComponent;
import com.example.kaogps.dagger2demo.presentation.dagger2.component.DaggerApplicationComponent;
import com.example.kaogps.dagger2demo.presentation.dagger2.component.DaggerMainActivityComponent;
import com.example.kaogps.dagger2demo.presentation.dagger2.component.MainActivityComponent;
import com.example.kaogps.dagger2demo.presentation.dagger2.module.AndroidModule;
import com.example.kaogps.dagger2demo.presentation.dagger2.module.CModule;

import javax.inject.Inject;

/**
 * Created by Sun
 * on 2017/3/2.
 */

public class MyApplication extends Application {

    @Inject
    LocationManager mLocationManager;

    public static MyApplication sApplication;

    private ApplicationComponent mComponent;

    private MainActivityComponent mActivityComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        mComponent = DaggerApplicationComponent
                .builder()
                .androidModule(new AndroidModule(this))
                .build();
        mActivityComponent = DaggerMainActivityComponent
                .builder()
                .applicationComponent(mComponent)
                .cModule(new CModule())
                .build();

    }

    public ApplicationComponent getComponent() {
        return mComponent;
    }

    public MainActivityComponent getMainActivityComponent() {
        return mActivityComponent;
    }

    public static MyApplication getApplication() {
        return sApplication;
    }
}
