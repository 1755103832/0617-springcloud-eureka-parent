package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.aaa")
public class ApplicationRun6083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6083.class, args);
    }
}
