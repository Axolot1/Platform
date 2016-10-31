package com.chufang.platform.injection.component;

import com.chufang.platform.ui.main.MainActivity;
import com.chufang.platform.injection.PerActivity;
import com.chufang.platform.injection.module.ActivityModule;

import dagger.Subcomponent;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
