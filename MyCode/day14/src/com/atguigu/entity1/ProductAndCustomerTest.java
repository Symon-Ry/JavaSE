package com.atguigu.entity1;

/**
 * @author Symon
 * @version 1.0
 * @className ProductAndCustomerTest
 * @description TODO
 * @date 2020/8/8 10:13
 */
public class ProductAndCustomerTest {
    public static void main(String[] args) {
        Store store = new Store();
        new Product("生产者1", store).start();
        new Product("生产者2", store).start();
        new Product("生产者3", store).start();

        new Customer("消费者1", store).start();
        new Customer("消费者2", store).start();
        new Customer("消费者3", store).start();
    }
}

class Store {
    private int item = 10;

    public Store() {
    }

    public synchronized void add() {
        while (item >= 20) {
            System.out.println("库存已满，等待消费~~~~~~~");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "生产一个商品，当前库存：" + (++item));
        notifyAll();
    }

    public synchronized void get() {
        while (item <= 0) {
            System.out.println("库存不足，等待生产~~~~~~~");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "消费一个商品，当前库存：" + (--item));
        notifyAll();
    }
}

class Product extends Thread{
    private Store store;

    public Product(Store store) {
        this.store = store;
    }

    public Product(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.add();
        }
    }
}

class Customer extends Thread {
    private Store store;

    public Customer(Store store) {
        this.store = store;
    }
    public Customer(String name, Store store) {
        super(name);
        this.store = store;
    }
    @Override
    public void run() {
        while (true) {
            store.get();
        }
    }
}
