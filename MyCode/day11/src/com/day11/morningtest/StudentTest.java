package com.day11.morningtest;

public class StudentTest {
    public static void main(String[] args) {
//        Student[] stus = new Student[5];
//        stus[0] = new Student("Tom",20,"男");
        Student[] stus = {new Student("Tom",20,"男"),
                new Student("Jerry",21,"男"),
                new Student("Mary",22,"女"),
                new Student("sanmao",20,"男"),
                new Student("xiaoqiang",23,"女")};
        // 增强for循环遍历
        for (Student student : stus) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------------");
        // 普通for循环
        for(int i=0;i<stus.length;i++){
            System.out.println(stus[i]);
        }
    }
}
