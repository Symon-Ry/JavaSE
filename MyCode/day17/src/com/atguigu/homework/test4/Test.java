package com.atguigu.homework.test4;

import java.util.ArrayList;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 19:19
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> prime = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int temp;
            boolean flag = true;
            list.add(temp = (int) (Math.random() * 98 + 2));
            for (int j = 2; j <= Math.sqrt(temp); j++) {
                if (temp % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                prime.add(temp);
            }
        }
        System.out.println("随机数为：");
        System.out.println(list);
        System.out.println("其中的质数为：");
        System.out.println(prime);
    }
}
