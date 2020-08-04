package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className Goods
 * @description TODO
 * @date 2020/7/31 8:49
 */
public class Goods{
    int id;
    double price;
    String name;
    int num;
    GoodsType goods;

    public Goods(int id, double price, String name, int num, GoodsType goods) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.num = num;
        this.goods = goods;
    }
}
