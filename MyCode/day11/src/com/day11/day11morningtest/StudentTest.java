package com.day11.day11morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className StudentTest
 * @description TODO
 * @date 2020/8/4 8:38
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student("Tom", 12, "boy");
        stus[1] = new Student("Tom", 12, "boy");
        stus[2] = new Student("Tom", 12, "boy");
        stus[3] = new Student("Tom", 12, "boy");
        stus[4] = new Student("Tom", 12, "boy");

        System.out.println(stus[0]);
        System.out.println(stus[0].equals(stus[1]));

        for (Student s : stus) {
            System.out.println(s);
        }
    }
}
