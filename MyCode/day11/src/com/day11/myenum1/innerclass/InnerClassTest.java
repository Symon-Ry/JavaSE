package com.day11.myenum1.innerclass;

/**
 * @author Symon
 * @version 1.0
 * @className InnerClassTest
 * @description TODO
 * @date 2020/8/4 15:12
 */
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.outMethod();
        out.new InnerClass().innerMethod();
    }
}
