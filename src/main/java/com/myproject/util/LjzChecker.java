package com.myproject.util;

import com.myproject.exception.CheckedException;

import java.util.List;

/**
 * 基础校验类
 *
 * @author lijinzao
 * @date 2018/3/14 17:42
 **/
public class LjzChecker {
    /**
     * 判断对象是否为null
     * true的话抛出Checked异常
     * false不做处理
     *
     * @param obj
     * @param message 异常的信息
     */
    public static void isNull(Object obj, String message) {
        if (obj == null) {
            throw new CheckedException(message);
        }
    }

    /**
     * 判断对象是否为null or ""
     * true的话抛出Checked异常
     * false不做处理
     *
     * @param obj     对象（object,List,String）
     * @param message 异常的信息
     */
    public static void isEmpty(Object obj, String message) {
        if (obj == null) {
            throw new CheckedException(message);
        }
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            throw new CheckedException(message);
        }
        if ((obj instanceof String) && ("".equals(((String) obj).trim()))) {
            throw new CheckedException(message);
        }
    }

}
