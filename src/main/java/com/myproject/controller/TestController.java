package com.myproject.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.google.gson.Gson;
import com.myproject.manager.TestManager;
import com.myproject.util.LjzRedisUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    private LjzRedisUtil redisTemplate;

    Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        PageRowBounds pageRowBounds = new PageRowBounds(1, 1);
        PageInfo pageInfo = testManager.queryPageInfoByEg("test.queryAll", null, pageRowBounds);
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping("/redis")
    public String redis() {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        redisTemplate.addSet("red_123", list);
        Set<String> red_123 = redisTemplate.opsForSet().members("red_123");
        Gson gson = new Gson();
        System.out.println(gson.toJson(red_123));
        return "redis";
    }
}
