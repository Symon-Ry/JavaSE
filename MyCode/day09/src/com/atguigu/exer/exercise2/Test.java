package com.atguigu.exer.exercise2;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/2 15:56
 */
public class Test {
    public static void goToilet(Person person) {
        person.toilet();
    }
    public static void main(String[] args) {
        goToilet(new Man());
        goToilet(new Woman());
        goToilet(new Man());
        goToilet(new Woman());
    }
}
