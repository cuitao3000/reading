package com.cc.reading.controller;

import com.cc.reading.dao.UserWordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserWordDao userWordDao;

    @RequestMapping("/")
    public String index() {
        return "hello";
    }


}
