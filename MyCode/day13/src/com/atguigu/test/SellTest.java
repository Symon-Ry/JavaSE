package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className SellTest
 * @description TODO
 * @date 2020/8/7 16:11
 */
public class SellTest {
    public static void main(String[] args) {
        A a = new A();
        new Thread(a).start();
        new Thread(a).start();

    }
}

class A implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets <= 0) {
                    System.out.println(Thread.currentThread().getName() + "卖完");
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖出" + (tickets--));

            }
        }
    }
}
