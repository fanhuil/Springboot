package com.itheima;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanhuilin
 * @date 2021-10-13 9:35
 */

@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private Environment env;

    @Value("${name}")
    private String name;

    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(env.getProperty("name"));
        System.out.println(person);
        return "hello Spring Boot 222!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot 222!";
    }
}

/**
 * 读取配置内容
 * @Value
 *
 * Environment
 *     @Autowired
 *     private Environment env;
 *
 * @ConfigurationProperties
 */