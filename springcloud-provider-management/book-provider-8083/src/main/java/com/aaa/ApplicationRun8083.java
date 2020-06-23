package com.aaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.mapper")
public class ApplicationRun8083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class, args);
    }
}
