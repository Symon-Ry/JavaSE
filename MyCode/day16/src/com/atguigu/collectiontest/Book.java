package com.atguigu.collectiontest;

import java.util.Objects;

/**
 * @author Symon
 * @version 1.0
 * @className Book
 * @description TODO
 * @date 2020/8/11 16:49
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public Book(String bookName, String author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    
}
