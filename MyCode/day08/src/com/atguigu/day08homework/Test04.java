package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test04
 * @description TODO
 * @date 2020/7/31 19:16
 */
/*
 * 当父类与子类有同名的属性时：
 * 通过子类对象调用getName()访问的是父类的name还是子类的name，
 * 那么要看子类是否重写，如果没有重写，就是父类的，重写了就是子类的。
 */
public class Test04 extends Test4Father{
    private String name = "test";

    public static void main(String[] args) {
        Test04 test = new Test04();
        System.out.println(test.getName());
    }
}
class Test4Father {
    private String name = "Test4Father";

    public String getName() {
        return name;
    }
}
