package com.aaa.controller;

import com.aaa.model.Book;
import com.aaa.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description 在使用feign的时候，springcloud1.x版本可以有多个service接口，
 * 但是在springcloud2.x版本之后一个项目只能有一个(feign和hystrix整合的时候最明显)
 **/
@RestController
public class BookController {

    @Autowired
    private ISpringCloudService springCloudService;

    /**
     * queryBooks
     *
     * @return
     */
    @GetMapping("/queryBooks")
    public List<Book> queryBooks() {
        return springCloudService.queryBooks();
    }
}
