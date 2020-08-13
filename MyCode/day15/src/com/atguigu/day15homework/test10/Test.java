package com.atguigu.day15homework.test10;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 19:35
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("取整后：" + ((Handleable) num -> {
            System.out.println("原数字：" + num);
            double d = new Double(num);
            int i = (int) d;
            return Integer.toString(i);
        }).handleString("23.23456789"));

        System.out.println("保留4位小数，四舍五入后：" + ((Handleable) num -> {
            System.out.println("原数字：" + num);
            return BigDecimal.valueOf(new Double(num)).setScale(4, RoundingMode.UP).toString();

        }).handleString("23.23456789"));
    }
}
