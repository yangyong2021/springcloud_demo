package com.yangyong.swjtu.order;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**
 * @author Yangyong
 * 2023-10-25 11:12
 */
@SpringBootApplication
@MapperScan("com.yangyong.swjtu.order.mapper")
@ServletComponentScan
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
