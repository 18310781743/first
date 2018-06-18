package com.zcc.first.controller;

import com.zcc.first.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("getUser")
    @ResponseBody
    public User getUser(){
        User user = new User();
        user.setName("zhucc");
        user.setAge(18);
        user.setBirthday(new Date());
        user.setPassword("zhuwcc1");
        user.setDesc("我是最帅的sdsdd");
        return user;
    }
}
