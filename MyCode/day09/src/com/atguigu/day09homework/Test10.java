package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test10
 * @description 1、声明抽象父类Person，包含抽象方法public abstract void pee();
 *
 * ​	2、声明子类Woman，重写抽象方法，打印坐着尿
 *
 * ​	3、声明子类Man，重写抽象方法，打印站着上尿
 *
 * ​	4、声明测试类Test10，创建Person数组，存放Woman和Man对象，并遍历数组，调用pee()方法
 * @date 2020/8/3 20:42
 */
public class Test10 {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Woman();
        people[1] = new Man();
        people[2] = new Woman();

        for (Person p : people) {
            p.pee();
        }
    }
}

abstract class Person {
    public abstract void pee();
}

class Woman extends Person {

    @Override
    public void pee() {
        System.out.println("坐着尿");
    }
}

class Man extends Person {

    @Override
    public void pee() {
        System.out.println("站着尿");
    }
}
