package com.aaa;

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
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }
}
