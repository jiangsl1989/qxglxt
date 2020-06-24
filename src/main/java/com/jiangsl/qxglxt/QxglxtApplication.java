package com.jiangsl.qxglxt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = {"com.jiangsl.qxglxt"})
@MapperScan("com.jiangsl.qxglxt.dao")
@EnableCaching
public class QxglxtApplication {

    public static void main(String[] args) {
        SpringApplication.run(QxglxtApplication.class, args);
    }

}
