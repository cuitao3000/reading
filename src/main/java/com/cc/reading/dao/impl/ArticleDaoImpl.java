package com.cc.reading.dao.impl;

import com.cc.reading.dao.ArticleDao;
import com.cc.reading.pojo.Article;
import com.cc.reading.pojo.UserWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ArticleDaoImpl implements ArticleDao {


    @Autowired
    @Qualifier("readingJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Article> rowMapper;

    public ArticleDaoImpl() {
        this.rowMapper = new BeanPropertyRowMapper<>(Article.class);
    }

    @Override
    public Article findById(Integer id) {

        String sql = "select id,taskid,table_name,url,result from article where id = ?";
        List<Article> query = jdbcTemplate.query(sql , ps -> ps.setInt(1,id), rowMapper);

        return query.size() == 0 ? null : query.get(0) ;
    }
}
