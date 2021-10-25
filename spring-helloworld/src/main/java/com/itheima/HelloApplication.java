package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类，SpringBoot项目入口
 *
 * @author fanhuilin
 * @date 2021-10-13 9:22
 */
@SpringBootApplication // 标记成springboot的启动类,也是一个配置类
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}
