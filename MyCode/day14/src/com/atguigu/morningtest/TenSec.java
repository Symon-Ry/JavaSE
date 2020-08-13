package com.atguigu.morningtest;

/**
 * @author Symon
 */
public class TenSec {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(10 - i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("时间到");
        }).start();
    }
}

