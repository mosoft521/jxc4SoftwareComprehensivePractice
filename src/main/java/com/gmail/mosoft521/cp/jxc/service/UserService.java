package com.gmail.mosoft521.cp.jxc.service;

/**
 * 用户业务接口
 */
public interface UserService {
    /**
     * 用户登录的方法, 如果登录失败，则抛出BusinessException
     *
     * @param username 用户名
     * @param pass 密码
     */
    boolean checkLogin(String username, String pass);
}
