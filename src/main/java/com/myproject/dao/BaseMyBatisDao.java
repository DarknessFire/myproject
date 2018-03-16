package com.myproject.dao;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import org.springframework.dao.DataAccessException;

/**
 * @author lijinzao
 * @date 2018/3/14
 **/
public interface BaseMyBatisDao {
    /**
     * 根据id查找单条数据
     *
     * @param statement 查询语句id
     * @param id        对象id
     * @param <T>       对象泛型
     * @return 查询对象
     * @throws DataAccessException 异常
     */
    public <T> T queryObjectById(String statement, String id) throws DataAccessException;

    /**
     * 根据条件查询单条数据
     *
     * @param statement 查询语句id
     * @param obj       查询条件
     * @param <T>       对象泛型
     * @return 查询对象
     * @throws DataAccessException 异常
     */
    public <T> T queryObjectByParams(String statement, Object obj) throws DataAccessException;

    /**
     * 新增
     *
     * @param statement
     * @param obj
     * @return
     * @throws DataAccessException
     */
    public Integer insertObject(String statement, Object obj) throws DataAccessException;

    /**
     * 查询分页
     *
     * @param statement
     * @param obj
     * @param pageRowBounds
     * @return
     */
    public PageInfo queryPageInfoByEg(String statement, Object obj, PageRowBounds pageRowBounds);


}
