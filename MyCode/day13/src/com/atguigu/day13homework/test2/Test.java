package com.atguigu.day13homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/7 18:41
 */
public class Test {
    public static void main(String[] args) {
        new OODSubThread().start();
        new EVENSubThread().start();
    }
}

class OODSubThread extends Thread {
    private int num = -1;
    @Override
    public synchronized void run() {
        while (true) {
            synchronized (Test.class) {
                for (int i = 0; i < 5; i++) {
                    num += 2;
                    System.out.println("奇数线程，第" + (i + 1) + "个：" + num);
                }
                System.out.println("------------------");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class EVENSubThread extends Thread {
    private int num = -2;
    @Override
    public void run() {
        while (true) {
            synchronized (Test.class) {
                for (int i = 0; i < 5; i++) {
                    num += 2;
                    System.out.println("偶数线程，第" + (i + 1) + "个：" + num);
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}