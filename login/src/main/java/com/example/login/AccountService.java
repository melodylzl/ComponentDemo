package com.example.login;

import com.example.componentbase.service.IAccountService;

/**
 * @author melody
 * @date 2020/2/3
 */
public class AccountService implements IAccountService {

    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "10000";
    }
}
