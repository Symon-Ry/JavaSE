package com.day11.innerclass;

public class Outer1Test {
    public static void main(String[] args) {
//        OuterClass1 oc1 = new OuterClass1();
//        oc1.setOuterFiled(1000);
//        oc1.outerMethod();

        // 静态内部类创建对象的时候不需要创建外部类对象再创建内部类对象，可以直接创建内部类对象。
        OuterClass1.InnerClass1 oi1 = new OuterClass1.InnerClass1();
        oi1.innerMtehod();

    }
}
