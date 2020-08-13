package com.atguigu.homework.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className Test2
 * @description TODO
 * @date 2020/8/12 18:09
 */
public class Test2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("选择（1、录入；0、退出）：");
            int i = input.nextInt();
            if (i == 0) {
                break;
            } else if (i == 1) {
                System.out.print("姓名：");
                String name = input.next();
                System.out.print("年龄：");
                int age = input.nextInt();
                list.add(new Student(name, age));
            } else {
                System.out.println("请重新输入：");
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
