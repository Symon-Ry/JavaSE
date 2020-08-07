package com.day11.morningtest;

public class Student {
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if(this == obj){
            flag = true;
        }else{
            if(obj instanceof Student){
                Student stu = (Student)obj;
                if(this.getStuName().equals(stu.getStuName())
                        &&this.getStuAge()==stu.getStuAge()
                        &&this.getStuGender().equals(stu.getStuGender())){
                    flag = true;
                }
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return "你好，我叫"+stuName+",我今年"+stuAge+"岁,我是一名"+stuGender+"同学";
    }
}
