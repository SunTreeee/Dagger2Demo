package com.example.kaogps.dagger2demo.presentation.view;

import android.location.LocationManager;
import android.util.Log;

/**
 * Created by Sun
 * on 2017/3/2.
 */

public class Test3 {
    //    private LocationManager mLocationManager;
    private int a;
    //    public Test3(LocationManager locationManager) {
    //        mLocationManager = locationManager;
    //    }

    public Test3(int init) {
        this.a = init;
    }

    public void log(String log) {
        Log.d("Test", log + a);
    }
}
