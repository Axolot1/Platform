package com.chufang.platform;

import android.app.Application;
import android.content.Context;

import com.chufang.platform.injection.component.ApplicationComponent;
import com.chufang.platform.injection.component.DaggerApplicationComponent;
import com.chufang.platform.injection.module.ApplicationModule;
import com.facebook.stetho.Stetho;

import timber.log.Timber;

/**
 * Created by axolotl on 16/10/28.
 */

public class PlatformApplication extends Application {

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static PlatformApplication get(Context context) {
        return (PlatformApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }

}
