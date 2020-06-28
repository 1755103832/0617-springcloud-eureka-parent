package com.aaa.controller;

import com.aaa.model.Book;
import com.aaa.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/18
 * @Description
 **/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    /**
     * @param []
     * @return java.util.List<com.aaa.lee.springcloud.model.Book>
     * @throws
     * @author Seven Lee
     * @description consumer的controller调用service接口
     * --->service接口映射provider中controller
     * --->但是provider中的controller抛出异常
     * --->调用selectAllBooks()备用方法
     * @HystrixCommand指向后备的方法
     * @date 2019/11/12
     **/
    @GetMapping("/queryBooks")
    @HystrixCommand(fallbackMethod = "queryBooksFallback")
    public List<Book> queryBooks() throws Exception {
        List<Book> bookList = bookService.queryBooks();
        if (bookList.size() > 0) {
            throw new Exception("模拟异常,测试熔断处理!!!");
        }
        return bookList;
    }

    public List<Book> queryBooksFallback() {
        List<Book> bookList = new ArrayList<>();
        Book book = new Book();
        book.setId(11L);
        book.setBookName("测试熔断,图书名称");
        book.setBookPrice("999.00");
        bookList.add(book);
        return bookList;
    }
}
