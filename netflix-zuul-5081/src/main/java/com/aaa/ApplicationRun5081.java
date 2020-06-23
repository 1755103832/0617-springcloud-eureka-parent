package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author zyb
 * @Date 2020/6/20
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class, args);
    }
}
