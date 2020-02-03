package com.example.componentbase;

import com.example.componentbase.empty_service.EmptyAccountService;
import com.example.componentbase.service.IAccountService;

/**
 * @author melody
 * @date 2020/2/3
 */
public class ServiceFactory {

    private IAccountService mAccountService;

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    public void setAccountService(IAccountService accountService) {
        mAccountService = accountService;
    }

    public IAccountService getAccountService() {
        if (mAccountService == null) {
            mAccountService = new EmptyAccountService();
        }
        return mAccountService;
    }
}
