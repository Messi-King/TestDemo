package org.example.controller;

import org.example.model.ZiDingYiClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest")
public class TestRestController {

    @GetMapping("/1")//Get方法
    public Object test1() {
        ZiDingYiClass ziDingYiClass = new ZiDingYiClass();
        ziDingYiClass.setCode("002");
        ziDingYiClass.setMessage("用户不存在");
        ziDingYiClass.setData(new Date());
        return ziDingYiClass;
    }
}