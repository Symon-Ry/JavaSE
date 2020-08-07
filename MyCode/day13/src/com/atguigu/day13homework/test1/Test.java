package com.atguigu.day13homework.test1;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/7 18:34
 */
public class Test {
    public static void main(String[] args) {
        new SubThread().start();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("main主线程-->" + i);
            }
        }
    }
}

class SubThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("子线程-->" + i);
            }
        }
    }
}
