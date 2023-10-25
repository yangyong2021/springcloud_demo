package com.yangyong.swjtu.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yangyong
 * 2023-10-25 11:12
 */
@SpringBootApplication
@MapperScan("com.yangyong.swjtu.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
