package com.day11.inter;

public class PersonTest {
    public static void main(String[] args) {
        Person.methodTwo(10,20);// 接口中的静态方法可以用接口名直接调用
        Person p = new Teacher();
        p.sayHello();
        System.out.println(p.methodOne());
    }
}
