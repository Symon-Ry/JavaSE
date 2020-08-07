package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TestInherite2
 * @date 2020/8/1 11:39
 */
public class TestInherite2 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.a);//20
        System.out.println(son.b);//11

        son.test();

        son.method(30);

        son.fun(13);
    }
}
class Father{
    int a = 10;
    int b = 11;
}

class Son extends Father{
    int a = 20;

    public void test(){
        //子类与父类的属性同名，子类对象中就有两个a
        //10    直接从父类局部变量找
        System.out.println("父类的a：" + super.a);
        System.out.println("子类的a：" + this.a);//20   先从本类成员变量找
        System.out.println("子类的a：" + a);//20  先找局部变量找，没有再从本类成员变量找

        //子类与父类的属性不同名，是同一个b
        System.out.println("b = " + b);//11  先找局部变量找，没有再从本类成员变量找，没有再从父类找
        System.out.println("b = " + this.b);//11   先从本类成员变量找，没有再从父类找
        System.out.println("b = " + super.b);//11  直接从父类局部变量找
    }

    public void method(int a){
        //子类与父类的属性同名，子类对象中就有两个成员变量a，此时方法中还有一个局部变量a
        System.out.println("父类的a：" + super.a);//10  直接从父类局部变量找
        System.out.println("子类的a：" + this.a);//20  先从本类成员变量找
        System.out.println("局部变量的a：" + a);//30  先找局部变量
    }

    public void fun(int b){
        System.out.println("b = " + b);//13  先找局部变量
        System.out.println("b = " + this.b);//11  先从本类成员变量找
        System.out.println("b = " + super.b);//11  直接从父类局部变量找
    }
}
