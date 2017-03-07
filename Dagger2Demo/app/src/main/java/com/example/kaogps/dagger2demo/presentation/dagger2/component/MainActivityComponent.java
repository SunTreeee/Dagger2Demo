package com.example.kaogps.dagger2demo.presentation.dagger2.component;

import com.example.kaogps.dagger2demo.presentation.annotation.PerActivity;
import com.example.kaogps.dagger2demo.presentation.dagger2.module.CModule;
import com.example.kaogps.dagger2demo.presentation.view.MainActivity;

import dagger.Component;

/**
 * Created by Sun
 * on 2017/3/2.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = CModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
