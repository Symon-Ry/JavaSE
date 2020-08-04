package com.atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className Teacher
 * @description 子类，继承Person
 * @date 2020/7/31 15:42
 */
public class Teacher extends Person{

    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void teachClass() {
        System.out.println("给学生上课");
    }
}
