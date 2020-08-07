package com.atguigu.day13homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className BankTest
 * @description TODO
 * @date 2020/8/7 19:45
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Husband(bank).start();
        new Wife(bank).start();
    }
}

class Bank {
    private static long id;
    private static double balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        Bank.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        Bank.balance = balance;
    }

    public synchronized void add() {
        double num = Math.random() * 10000;
        System.out.println("丈夫开始存钱，目前账户状态：" + toString());
        System.out.println("丈夫本次存钱：" + num);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += num;
        System.out.println("丈夫存钱结束，目前账户状态：" + toString());
        System.out.println("=============================");
        this.notify();
    }

    public synchronized void get() {

        double num = Math.random() * 10000;
        if (balance <= 0) {
            System.out.println("本次妻子想取钱：" + num + "但是余额不足，等待...");
            System.out.println("=============================");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance -= num;
        System.out.println("妻子本次取钱：" + num);
        System.out.println("妻子取钱结束，目前账户状态：" + toString());
        System.out.println("=============================");
    }

    @Override
    public String toString() {
        return "账户：" + id + "，余额：" + balance;
    }
}

class Husband extends Thread{
    private Bank bank;
    public Husband(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {

            bank.add();

        }
    }
}

class Wife  extends Thread{
    private Bank bank;

    public Wife(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            bank.get();
        }
    }
}
