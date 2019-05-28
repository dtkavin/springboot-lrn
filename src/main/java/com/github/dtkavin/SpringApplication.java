package com.github.dtkavin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: springboot-lrn
 * @description: 启动类
 * @author: zhangzhiyong
 * @create: 2019-04-17 12:08
 **/

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = "com.github.dtkavin.dao")
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}
