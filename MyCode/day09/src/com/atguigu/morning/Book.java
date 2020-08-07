package com.atguigu.morning;

/**
 * @author Symon
 * @version 1.0
 * @className Book
 * @description TODO
 * @date 2020/8/1 8:38
 */
public class Book {
    private String name;
    private String author;
    private double price;
    private String press;

    /**
    * @author Symon
    * @description 构造方法的特点和使用方式
     *              没有返回类型
     *              与类同名，默认隐式无参构造器
     *              不能重写
     *            使用方式：
     *              只能在创建对象的时候使用，且仅调用一次
    * @date 8:41 2020/8/1
    * @return
    **/


    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}
