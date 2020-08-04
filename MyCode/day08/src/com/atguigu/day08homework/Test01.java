package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test01
 * @description 实例初始化由：
 *      （1）非静态成员变量的显式赋值代码
 *      （2）非静态代码块代码
 *      （3）构造器代码
 *      其中（1）（2）按编写顺序，（3）在最后
 * @date 2020/7/31 18:50
 */
class HelloA{
    public HelloA(){
        System.out.println("HelloA");

    }
    {
        System.out.println("I'm A Class");
    }
}

class HelloB extends HelloA{
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("I'm B Class");
    }
}
public class Test01{
    public static void main(String[] args) {
        new HelloB();
    }
}
