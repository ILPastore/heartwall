package com.pastore.bizapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {


    @RequestMapping(value = "/get", method= RequestMethod.GET)
    public String getUserList() {
        return "hello world!";
    }


}