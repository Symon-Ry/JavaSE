package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test03
 * @description TODO
 * @date 2020/7/31 18:53
 */
/*
 * 1、Father f = new Father();
 * 执行父类的实例初始化方法
 * <init>(){
 * 		System.out.println("father create");
 * }
 *
 * 2、Test3Child c = new Test3Child();
 * （1）先执行父类的实例初始化方法
 * <init>(){
 * 		System.out.println("father create");
 * }
 * （2）再执行子类的实例初始化方法
 * <init>(){
 * 		System.out.println("Test3Child create");
 * }
 */
public class Test03 {
    public static void main(String[] args) {
        Father f = new Father();
        Test3Child c = new Test3Child();
    }
}
class Father {
    public Father(){
        System.out.println("father create");
    }
}
class Test3Child extends Father{
    public Test3Child(){
        System.out.println("Test3Child create");
    }
}
