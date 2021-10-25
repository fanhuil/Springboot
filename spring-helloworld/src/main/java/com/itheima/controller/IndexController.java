package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanhuilin
 * @date 2021-10-25 14:04
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public String index(){
        return "我是首页";
    }
}
