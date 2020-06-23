package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyb
 * @Date 2020/6/22
 * @Description
 **/
@RestController
public class BookController {

    /**
     * @Author zyb
     * @Description selectAllString
     * @Date 2020/6/22 9:26
     * @Param []
     * @Return java.util.List<java.lang.String>
     **/
    @RequestMapping("/all")
    public List<String> selectAllString() {
        List<String> stringList = new ArrayList<>();
        String str = "123456789";
        stringList.add(str);
        return stringList;
    }
}
