package com.example.kaogps.dagger2demo.presentation.view;

import android.content.Context;
import android.util.Log;

import java.util.logging.Logger;

import javax.inject.Inject;

/**
 * Created by Sun
 * on 2017/3/2.
 */

public class Test {
    private Context mContext;

    @Inject
    public Test(Context context) {
        mContext = context;
    }

    public void log(String log) {
        Log.d("Test", log);
    }
}
