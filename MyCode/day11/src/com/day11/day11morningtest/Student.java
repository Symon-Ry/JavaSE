package com.day11.day11morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className Student
 * @description TODO
 * @date 2020/8/4 8:33
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void studyA() {
        System.out.println("学习");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag=false;
        if (this == obj) {
            flag = true;
        } else if (obj instanceof Student) {
            Student stu = (Student) obj;
            if (stu.name.equals(name) && stu.age == age && stu.gender.equals(gender)) {
                flag = true;
            }
        }
        return flag;
    }
}
