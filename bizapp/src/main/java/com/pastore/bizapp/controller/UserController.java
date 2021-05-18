package com.pastore.bizapp.controller;

import com.pastore.bizapp.pojo.UserInfo;
import com.pastore.evolution.common.ResResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @RequestMapping(value = "/get", method= RequestMethod.GET)
    public String getUserList(String msg) {
        return msg;
    }

    @PostMapping("/getUser")
    public ResResult<UserInfo> getUser(@RequestBody UserInfo userInfo) {
        return ResResult.success(userInfo);
    }


}
