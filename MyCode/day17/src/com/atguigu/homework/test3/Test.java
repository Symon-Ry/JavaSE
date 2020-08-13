package com.atguigu.homework.test3;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 18:54
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }
        System.out.println("10个随机数：" + list);

        ArrayList<Integer> maxs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int max = 0;
            int index = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > max) {
                    max = list.get(j);
                    index = j;
                }
            }
            maxs.add(list.remove(index));
        }


        System.out.println("前3个最大的：" + maxs);
        System.out.println("删除后：" + list);

    }
}
