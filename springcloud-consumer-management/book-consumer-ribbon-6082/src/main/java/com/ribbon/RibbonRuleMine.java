package com.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@Configuration
public class RibbonRuleMine {

    @Bean
    public IRule mineRule() {
        return new RandomRule();
    }
}
