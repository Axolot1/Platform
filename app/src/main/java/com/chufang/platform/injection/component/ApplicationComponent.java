package com.chufang.platform.injection.component;

import android.app.Application;
import android.content.Context;

import com.chufang.platform.data.DataManager;
import com.chufang.platform.data.SyncService;
import com.chufang.platform.data.local.DatabaseHelper;
import com.chufang.platform.data.local.PreferencesHelper;
import com.chufang.platform.data.remote.RibotsService;
import com.chufang.platform.injection.ApplicationContext;
import com.chufang.platform.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext
    Context context();

    Application application();

    RibotsService ribotsService();

    PreferencesHelper preferencesHelper();

    DatabaseHelper databaseHelper();

    DataManager dataManager();
//    RxEventBus eventBus();

}
