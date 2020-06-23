package com.aaa.fallback;

import com.aaa.model.Book;
import com.aaa.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/19
 * @Description
 **/
@Component
public class ISpringCloudServiceFallbackFactory implements FallbackFactory<ISpringCloudService> {
    @Override
    public ISpringCloudService create(Throwable throwable) {
        return new ISpringCloudService() {
            @Override
            public List<Book> queryBooks() {
                System.out.println("我是测试熔断的方法，我被访问了，ISpringCloudService接口中的queryBooks方法抛出异常!!!");
                return null;
            }
        };
    }
}
