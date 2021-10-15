package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanhuilin
 * @date 2021-10-13 9:20
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot";
    }
}
