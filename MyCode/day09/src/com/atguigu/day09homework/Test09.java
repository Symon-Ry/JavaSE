package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test09
 * @description TODO
 * @date 2020/8/3 20:36
 */
public class Test09 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract class A{
    int numa=10;

    public abstract void showA();

}

abstract class B extends A{
    int numb=20;

    public abstract void showB();

}

class C extends B{

    int numc=30;

    @Override
    public void showA() {
        System.out.println(numa);
    }

    @Override
    public void showB() {
        System.out.println(numb);
    }

    public void showC() {
        System.out.println(numc);
    }
}
