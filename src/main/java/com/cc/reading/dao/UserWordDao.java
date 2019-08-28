package com.cc.reading.dao;

import com.cc.reading.pojo.User;
import com.cc.reading.pojo.UserWord;

import java.util.List;

public interface UserWordDao {

    List<UserWord> findByUserId(Integer userId);

}
