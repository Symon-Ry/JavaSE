package com.day11.inter;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/4 16:56
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = () -> System.out.println("Sweet Baby~  Love u~~");

        p1.sayHello();
    }
}
