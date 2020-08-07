package com.day11.day11homework.test7;

/**
 * @author Symon
 * @version 1.0
 * @className Worker
 * @description TODO
 * @date 2020/8/4 23:15
 */
public class Worker {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        if (c instanceof Apple.Compare) {
            Apple.Compare big = (Apple.Compare) c;
            System.out.println("默认挑大的：");
            big.compare(a1, a2);
            System.out.println("挑红的：");
            big.compareColor(a1, a2);
        }
    }
}
