package com.myproject.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.google.gson.Gson;
import com.myproject.manager.TestManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lijinzao
 * @date 2018/3/14
 **/
@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private TestManager testManager;
    @Autowired
    private StringRedisTemplate redisTemplate;

    Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        logger.debug("hhhh");
        PageRowBounds pageRowBounds = new PageRowBounds(1, 1);
        PageInfo pageInfo = testManager.queryPageInfoByEg("test.queryAll", null, pageRowBounds);
        Gson gson = new Gson();
        String s = gson.toJson(pageInfo);
        System.out.println(s);
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping("/redis")
    public String redis() {
        //stringRedisTemplate的操作
        // String读写
        redisTemplate.delete("myStr");
        redisTemplate.opsForValue().set("myStr", "skyLine");
        System.out.println(redisTemplate.opsForValue().get("myStr"));
        System.out.println("---------------");
        return "redis";
    }
}
