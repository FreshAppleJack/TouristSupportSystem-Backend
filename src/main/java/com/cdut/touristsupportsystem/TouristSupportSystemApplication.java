package com.cdut.touristsupportsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cdut.touristsupportsystem.mapper")
public class TouristSupportSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TouristSupportSystemApplication.class, args);
    }

}
