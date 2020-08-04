package com.atguigu.test;

import com.atguigu.entity.Student;

/**
 * @author Symon
 * @version 1.0
 * @className GoodsTool
 * @description TODO
 * @date 2020/7/31 8:51
 */
public class GoodsTool{
    public void print(Goods goods){
        System.out.println("id:" + goods.id + ",name:" + goods.name + ",price:" + goods.price + ",num:" + goods.num + ",goodsType:" + goods.goods);
    }

    public static void print(int... args) {
        for (int arg : args) {
            System.out.println(arg);
        }
    }


    public static void main(String[] args) {
        //print(new Goods(1, 12.4, "goods1", 12, new GoodsType(11, "g1", 1)));
        print(new int[]{1,2,3});
    }

}
