package com.aaa.model;

import java.io.Serializable;

/**
 * @Author zyb
 * @Date 2020/6/19
 * @Description
 **/
public class Book implements Serializable {
    private Long id;

    private String bookName;

    private String bookPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice == null ? null : bookPrice.trim();
    }
}