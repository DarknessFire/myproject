package com.myproject.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.google.gson.Gson;
import com.myproject.manager.testManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private testManager testManager;
    Logger logger = Logger.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        logger.debug("hhhh");
        PageRowBounds pageRowBounds = new PageRowBounds(1, 1);
        List<Object> objects = testManager.selectListByEg("test.queryAll", null, pageRowBounds);
        PageInfo pageInfo = new PageInfo(objects);
        Gson gson = new Gson();
        String s = gson.toJson(pageInfo);
        System.out.println(s);

        return "Hello world";
    }
}
