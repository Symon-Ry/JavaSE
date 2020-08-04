package com.atguigu.entity;


/**
 * @author Symon
 * @version 1.0
 * @className Student
 * @description 子类，继承Person
 * @date 2020/7/31 10:33
 */
public class Student extends Person{
    
    
    private int sutId;

    public Student() {
        System.out.println("无参构造函数");
    }

    public Student(int sutId) {
        //- this(); //默认不调用this()
        this.sutId = sutId;
        System.out.println("有参构造函数");
    }

    public int getid() {
        return sutId;
    }

    public void setid(int sutId) {
        this.sutId = sutId;
    }

    public void study() {
        System.out.println("学生在学习");
    }

}
