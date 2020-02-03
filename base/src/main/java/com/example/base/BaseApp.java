package com.example.base;

import android.app.Application;

/**
 * @author melody
 * @date 2020/2/3
 */
public abstract class BaseApp extends Application {

    public abstract void initModuleApp(Application application);

    public abstract void initModuleData(Application application);
}
