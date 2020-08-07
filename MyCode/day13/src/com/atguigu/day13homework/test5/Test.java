package com.atguigu.day13homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/7 20:51
 */
public class Test {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        for (int i = 0; i < 10; i++) {
            new Thread(tunnel, "p" + (i + 1)).start();
        }
    }
}

class Tunnel implements Runnable {
    private int nums=0;
    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName() + "开始通过隧道...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nums++;
        System.out.println(Thread.currentThread().getName() + "已经通过隧道，TA时第" + nums + "个通过的！");
        if (nums == 10) {
            System.out.println("All pass");
        }
    }
}
