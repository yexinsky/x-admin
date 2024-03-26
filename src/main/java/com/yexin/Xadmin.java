package com.yexin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yexin.mapper")
public class Xadmin {
    public static void main(String[] args) {
        SpringApplication.run(Xadmin.class,args);
    }
}
