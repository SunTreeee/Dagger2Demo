package com.example.kaogps.dagger2demo.presentation.dagger2.module;

import android.content.Context;
import android.location.LocationManager;

import com.example.kaogps.dagger2demo.common.MyApplication;
import com.example.kaogps.dagger2demo.presentation.view.Test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sun
 * on 2017/3/2.
 */

@Module
public class AndroidModule {
    private final MyApplication mApplication;

    public AndroidModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Context ApplicationContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager() {
        return (LocationManager) mApplication.getSystemService(Context.LOCATION_SERVICE);
    }

    @Provides
    @Singleton
    Test provideTest() {
        return new Test(mApplication);
    }
}

