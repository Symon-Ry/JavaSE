package com.atguigu.homework.test2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 18:42
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> src = new ArrayList<>();
        ArrayList<Integer> guess = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("乐透号码已生成，游戏开始：");
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字[1~50]:");
            guess.add(input.nextInt());
            src.add(random.nextInt(50) + 1);
        }

        int count = 0;
        for (Integer i : src) {
            if (guess.contains(i)) {
                count++;
            }
        }

        System.out.println("您输入的号码为：" + guess);
        System.out.println("乐透号码为：" + src);
        System.out.println("猜中了：" + count + "个数字");
    }
}
