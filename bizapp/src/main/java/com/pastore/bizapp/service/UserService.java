package com.pastore.bizapp.service;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    /**
     * 登录
     */
    void login(HttpServletRequest request);
}
