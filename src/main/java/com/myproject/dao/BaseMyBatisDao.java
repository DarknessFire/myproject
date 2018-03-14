package com.myproject.dao;

import org.springframework.dao.DataAccessException;

public interface BaseMyBatisDao {
    /**
     * 根据id查找单条数据
     *
     * @param statement 查询语句id
     * @param id        对象id
     * @param <T>
     * @return
     */
    public <T> T queryObjectById(String statement, String id) throws DataAccessException;

    /**
     * 根据条件查询单条数据
     *
     * @param statement 查询语句id
     * @param obj       查询条件
     * @param <T>
     * @return
     */
    public <T> T queryObjectByParams(String statement, Object obj) throws DataAccessException;

    /**
     * 新增
     *
     * @param statementName
     * @param obj
     * @throws DataAccessException
     */
    public Integer insertObject(String statementName, Object obj) throws DataAccessException;



}
