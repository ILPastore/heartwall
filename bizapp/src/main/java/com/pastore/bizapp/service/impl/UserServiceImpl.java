package com.pastore.bizapp.service.impl;

import com.pastore.bizapp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void login(HttpServletRequest request) {
        log.info("请求参数[{}]", request.getHeader("auth"));
        if (request.getHeader("auth") == null) {
            throw new RuntimeException("请传递鉴权信息");
        }
    }
}
