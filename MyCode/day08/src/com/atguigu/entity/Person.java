package com.atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className Person
 * @description 父类
 * @date 2020/7/31 15:39
 */
public class Person {
    private String name;

    private int age;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
