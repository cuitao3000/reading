package com.cc.reading.controller;

import com.cc.reading.ResponseData;
import com.cc.reading.dao.UserWordDao;
import com.cc.reading.pojo.User;
import com.cc.reading.pojo.UserWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserWordController {

    @Autowired
    private UserWordDao userWordDao;

    @RequestMapping("/api")
    public ResponseData index() {

        ResponseData responseData = new ResponseData(0);
        responseData.setMessage("xxx");
        return responseData;
    }

    @RequestMapping("/api/test")
    public ResponseData test() {
        List<UserWord> userWordList = userWordDao.findByUserId(1);

        ResponseData responseData = new ResponseData(0);
        responseData.setData(userWordList);

        return responseData;
    }

    @RequestMapping("/api/Article")
    public ResponseData article() {
        List<UserWord> userWordList = userWordDao.findByUserId(1);

        ResponseData responseData = new ResponseData(0);
        responseData.setData(userWordList);

        return responseData;
    }
}
