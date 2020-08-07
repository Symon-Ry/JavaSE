package com.day11.inter;

public interface Person {

    public abstract void sayHello();

    // 从1.8开始允许在接口中声明default方法。
    public default String methodOne(){
        return "in methodOne defualt";
    }

    // 从1.8开始允许在接口中声明static的方法
    public static void methodTwo(int a, int b){
        System.out.println("in methodTwo static");
        System.out.println(a+"+"+b+"="+(a+b));
    }

}
