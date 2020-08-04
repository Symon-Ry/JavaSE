package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className HelloB15
 * @description TODO
 * @date 2020/8/3 18:48
 */
class HelloA15{
    public HelloA15(){
        System.out.println("HelloA15");
    }
    {
        System.out.println("I'm A Class");
    }
    static{
        System.out.println("static A");
    }
}

public class HelloB15 extends HelloA15{
    public HelloB15(){
        System.out.println("HelloB15");
    }
    {
        System.out.println("I'm B Class");
    }
    static{
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB15();
    }

}
