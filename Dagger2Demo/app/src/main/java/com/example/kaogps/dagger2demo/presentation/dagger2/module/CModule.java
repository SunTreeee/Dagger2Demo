package com.example.kaogps.dagger2demo.presentation.dagger2.module;

import android.location.LocationManager;

import com.example.kaogps.dagger2demo.presentation.annotation.ForBoy;
import com.example.kaogps.dagger2demo.presentation.annotation.ForGirl;
import com.example.kaogps.dagger2demo.presentation.annotation.PerActivity;
import com.example.kaogps.dagger2demo.presentation.view.Test3;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Sun
 * on 2017/3/2.
 */
@Module
public class CModule {
    @ForBoy
    @Provides
    Test3 provideBoy(){
        return new Test3(1);
    }
    @ForGirl
    @Provides
    Test3 provideGirl(){
        return new Test3(2);
    }
}
