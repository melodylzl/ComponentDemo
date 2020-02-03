package com.example.componentbase.service;

/**
 * @author melody
 * @date 2020/2/3
 */
public interface IAccountService {

    /**
     * 是否登录
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的id
     * @return
     */
    String getAccountId();
}
