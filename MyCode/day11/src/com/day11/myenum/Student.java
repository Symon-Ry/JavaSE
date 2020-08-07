package com.day11.myenum;

public class Student {
    private String stuName = "Tom";
    private int stuAge = 20;
    private Gender stuGender = Gender.woman;

    public void sayHello(){
        System.out.println(stuGender);
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.sayHello();
    }
}
