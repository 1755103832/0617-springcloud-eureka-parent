package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7082.class, args);
    }
}
