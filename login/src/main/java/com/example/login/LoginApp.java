package com.example.login;

import android.app.Application;

import com.example.base.BaseApp;
import com.example.componentbase.ServiceFactory;

/**
 * @author melody
 * @date 2020/2/3
 */
public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
