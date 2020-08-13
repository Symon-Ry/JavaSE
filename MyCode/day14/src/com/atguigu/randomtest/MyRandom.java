package com.atguigu.randomtest;

import org.junit.Test;

/**
 * @author Symon
 * @version 1.0
 * @className MyRandom
 * @description TODO
 * @date 2020/8/8 14:28
 */
public class MyRandom {
    public static void NumRandom(int num1, int num2) {
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + (int) (Math.random() * (num2 - num1)));//大于等于num1，小于num2
        }
    }

    public static void CharRandom(char c1, char c2) {
        for (int i = 0; i < 10; i++) {
            System.out.println((char) (c1 + (char) (Math.random() * (c2 - c1 + 1))));//'c1~c2'
        }
    }

    @Test
    public void test() {
        MyRandom.NumRandom(23, 45);
        MyRandom.CharRandom('a', 'm');
    }
}
