package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className RunTest
 * @description TODO
 * @date 2020/8/7 14:41
 */
public class RunTest {
    public static void main(String[] args) {
        new Thread(new Tortoise()).start();
        new Thread(new Rabit()).start();
    }
}

class Tortoise implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("烏龜跑了" + i + "米~~~~~~");
            if (i == 30) {
                System.out.println("烏龜到達終點");
            }
            if (i % 10 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Rabit implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子跑了" + i + "米======");
            if (i == 30) {
                System.out.println("兔子到達終點");
            }
            if (i % 10 == 0) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
