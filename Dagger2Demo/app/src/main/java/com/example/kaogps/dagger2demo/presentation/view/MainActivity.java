package com.example.kaogps.dagger2demo.presentation.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kaogps.dagger2demo.R;
import com.example.kaogps.dagger2demo.common.MyApplication;
import com.example.kaogps.dagger2demo.presentation.annotation.ForBoy;
import com.example.kaogps.dagger2demo.presentation.annotation.ForGirl;
import com.example.kaogps.dagger2demo.presentation.dagger2.component.DaggerMainActivityComponent;
import com.example.kaogps.dagger2demo.presentation.dagger2.module.CModule;

import javax.inject.Inject;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity{

    //    @Inject
    //    Test mTest;
    @ForBoy
    @Inject
    Test3 mTest3Boy;

    @ForGirl
    @Inject
    Test3 mTest3Girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerApplicationComponent
//                .builder()
//                .androidModule(new AndroidModule((MyApplication) getApplication()))
//                .build();

        DaggerMainActivityComponent
                .builder()
                .applicationComponent(MyApplication.getApplication().getComponent())
                .cModule(new CModule())
                .build()
                .inject(this);
        mTest3Boy.log("啦啦啦");
        mTest3Girl.log("女");
    }

}
