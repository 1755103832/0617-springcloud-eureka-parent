package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author zyb
 * @Date 2020/6/22
 * @Description
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun4081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun4081.class, args);
    }
}
