package com.example.componentbase.empty_service;

import com.example.componentbase.service.IAccountService;

/**
 * @author melody
 * @date 2020/2/3
 */
public class EmptyAccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
