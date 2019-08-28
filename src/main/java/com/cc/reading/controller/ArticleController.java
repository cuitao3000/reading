package com.cc.reading.controller;

import com.cc.reading.ResponseData;
import com.cc.reading.dao.ArticleDao;
import com.cc.reading.dao.UserWordDao;
import com.cc.reading.pojo.Article;
import com.cc.reading.pojo.UserWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;


    @RequestMapping("/api/article/get")
    public ResponseData getArticle(@RequestParam(required = true) Integer id) {
        Article article = articleDao.findById(id);

        ResponseData responseData = new ResponseData(0);
        responseData.setData(article);

        return responseData;
    }
}
