package com.example.kaogps.dagger2demo.presentation.dagger2.component;

import android.location.LocationManager;

import com.example.kaogps.dagger2demo.presentation.dagger2.module.AndroidModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sun
 * on 2017/3/2.
 */

@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {
//    void injert(MyApplication application);
//
//    void injert(MainActivity activity);
//
//    Test provideTest();

    LocationManager getLocationManager();

//    CommonComponent getCommonComponent();
}
