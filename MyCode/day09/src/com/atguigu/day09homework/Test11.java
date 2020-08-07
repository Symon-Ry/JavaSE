package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test11
 * @description 1、声明抽象父类Person，包含抽象方法public abstract void eat();
 *
 * ​	2、声明子类中国人Chinese，重写抽象方法，打印用筷子吃饭
 *
 * ​	3、声明子类美国人American，重写抽象方法，打印用刀叉吃饭
 *
 * ​	4、声明子类印度人Indian，重写抽象方法，打印用手抓饭
 *
 * ​	5、声明测试类Test11，创建Person数组，存储各国人对象，并遍历数组，调用eat()方法
 * @date 2020/8/3 20:48
 */
public class Test11 {
    public static void main(String[] args) {
        Person11[] peo = new Person11[3];

        peo[0] = new Chinese();
        peo[1] = new American();
        peo[2] = new Indian();

        for (Person11 p : peo) {
            p.eat();
        }
    }
}

abstract class Person11 {
    public abstract void eat();
}

class Chinese extends Person11 {
    @Override
    public void eat() {
        System.out.println("用筷子吃饭");
    }
}

class American extends Person11 {
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");
    }
}

class Indian extends Person11 {
    @Override
    public void eat() {
        System.out.println("手抓饭");
    }
}

