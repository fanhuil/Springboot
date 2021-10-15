package com.itheima.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigApplication.class, args);
    }

}
/**
 * Springboot程序启动时，会从以下位置的加载配置文件：
 * file:/config/     :当前项目下的/config目录下
 * file:./           :当前项目的根目录
 * classpath:/config/:classpath的/config目录
 * classpath:/       :classpath的根目录
 *
 * 加载顺序为上文的排列顺序，高优先级配置的属性会生效
 */