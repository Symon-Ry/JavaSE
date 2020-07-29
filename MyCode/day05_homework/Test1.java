package cn.atguigu.day05homework;

import java.util.Random;

/**
 * @author Symon
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("您的大乐透号码为：");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) (Math.random()*100)+"\t");
        }

    }
}
