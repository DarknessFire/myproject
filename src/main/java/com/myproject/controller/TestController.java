package com.myproject.controller;

import com.myproject.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private BaseDao dao;
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        Map<String,Object> map = (Map<String, Object>) dao.findById("1");
        System.out.print(map.get("a_id"));
        return "Hello world";
    }
}
