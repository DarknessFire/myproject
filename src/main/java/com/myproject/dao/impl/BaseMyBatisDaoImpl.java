package com.myproject.dao.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.myproject.dao.BaseMyBatisDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import java.util.List;

public class BaseMyBatisDaoImpl extends SqlSessionDaoSupport implements BaseMyBatisDao {
    @Autowired(required = false)
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    public <T> T queryObjectById(String statement, String id) throws DataAccessException {
        return getSqlSession().selectOne(statement, id);
    }

    public <T> T queryObjectByParams(String statement, Object obj) throws DataAccessException {
        return getSqlSession().selectOne(statement, obj);
    }

    public Integer insertObject(String statementName, Object obj) throws DataAccessException {
        return getSqlSession().insert(statementName, obj);
    }

    public List<Object> selectListAll(String statement, Object obj) {
        return getSqlSession().selectList(statement, obj);
    }

    public PageInfo selectListByEg(String statement, Object obj, PageRowBounds pageRowBounds) {
        List<Object> objects = getSqlSession().selectList(statement, obj, pageRowBounds);
        return new PageInfo(objects);
    }
}
