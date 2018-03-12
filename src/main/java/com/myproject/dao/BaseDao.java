package com.myproject.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object findById(String id) {
        return sqlSessionTemplate.selectOne("test.queryId", id);
    }

}
