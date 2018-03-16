package com.myproject.util;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * redis常用工具类
 *
 * @author lijinzao
 * @date 2018/3/16 11:38
 **/
public class LjzRedisUtil extends StringRedisTemplate {
    /**
     * 设置值
     *
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        opsForValue().set(key, value);
    }

    /**
     * 设置值
     *
     * @param key   键
     * @param value 值
     * @param time  缓存时间
     */
    public void set(String key, String value, Long time) {
        opsForValue().set(key, value, time);
    }

    /**
     * 设置值
     *
     * @param key      键
     * @param value    值
     * @param time     缓存时间
     * @param timeType 时间类型
     */
    public void set(String key, String value, Long time, TimeUnit timeType) {
        opsForValue().set(key, value, time, timeType);
    }

    /**
     * 根据key获取缓存中的val
     *
     * @param key
     * @return
     */
    public String get(String key) {
        return opsForValue().get(key);
    }

    /**
     * 向指定key中存放set集合
     *
     * @param key
     * @param list
     */
    public void addSet(String key, List<String> list) {
        opsForSet().add(key, list.toArray(new String[]{}));
    }

    /**
     * 根据key获取set集合
     *
     * @param key
     * @return
     */
    public Set<String> getSet(String key) {
        return opsForSet().members(key);
    }

}
