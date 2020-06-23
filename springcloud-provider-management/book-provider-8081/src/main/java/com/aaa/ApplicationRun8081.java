package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zyb
 * @Date 2020/6/17
 * @Description
 **/
@SpringBootApplication
@MapperScan("com.aaa.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }
}
