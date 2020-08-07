package com.atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className ThreadOneTest
 * @description TODO
 * @date 2020/8/7 10:44
 */
public class ThreadOneTest {
    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i+"接口1");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i+"接口2");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new MyThreadOne().start();
        for (int i = 0; i <100; i++) {
            System.out.println(i+"主线程");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThreadOne extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "Thread子类1");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
