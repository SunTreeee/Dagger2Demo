package com.example.kaogps.dagger2demo.presentation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Sun
 * on 2017/3/2.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForBoy {
}
