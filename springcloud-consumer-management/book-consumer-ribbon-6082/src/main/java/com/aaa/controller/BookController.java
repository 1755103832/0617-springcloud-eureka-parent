package com.aaa.controller;

import com.aaa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@RestController
public class BookController {

    private static final String URL = "http://book-provider/queryBooks";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/queryBooks")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject(URL, List.class);
    }
}
