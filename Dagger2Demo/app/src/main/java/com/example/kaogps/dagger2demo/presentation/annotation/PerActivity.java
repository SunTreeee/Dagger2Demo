package com.example.kaogps.dagger2demo.presentation.annotation;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Sun
 * on 2017/3/2.
 */
@Scope
@Retention(RUNTIME)
public @interface PerActivity {
}
