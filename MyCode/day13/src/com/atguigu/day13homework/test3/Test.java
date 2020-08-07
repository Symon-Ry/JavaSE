package com.atguigu.day13homework.test3;




/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/7 19:06
 */
public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
        new Thread(mt).start();

    }
}

class MyThread implements Runnable {
    static int i = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                System.out.println(Thread.currentThread().getName() + ":" + (i++));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


