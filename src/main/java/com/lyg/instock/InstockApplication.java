package com.lyg.instock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyg.instock.mapper")
public class InstockApplication {

    public static void main(String[] args) {
        SpringApplication.run(InstockApplication.class, args);
    }

}
