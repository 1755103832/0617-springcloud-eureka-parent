package com.aaa.controller;

import com.aaa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/17
 * @Description
 **/
@RestController
public class BookController {

    private static final String URL = "http://localhost:8081/queryBooks";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/queryBooks")
    public List<Book> queryBooks() {
        return restTemplate.getForObject(URL, List.class);
    }
}
