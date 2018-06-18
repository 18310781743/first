package com.zcc.first.controller;

import com.zcc.first.domain.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @Autowired
    public Resource resource;

    @RequestMapping("getResource")
    public String getResource(){
        return resource.toString();
    }
}
