package com.example.testdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    //测试项目
    @PostMapping("diot")
    public String test(){
        return "success";
    }

    //获取参数
    @GetMapping("get")
    public String test2(){
        return "success get";
    }

}
