package com.itheima.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author fanhuilin
 * @date 2021-10-13 9:20
 */

@RestController
@CrossOrigin
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }

    @PostMapping ("/test")
    public HashMap testGetParam(@RequestBody String content) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;

    }
}
