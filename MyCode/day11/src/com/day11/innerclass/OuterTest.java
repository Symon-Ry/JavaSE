package com.day11.innerclass;

public class OuterTest {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.setOuterFiled(500);
        oc.outerMethod();

        // 普通成员内部类类型必须是外部类.内部类，创建对象的时候需要先创建外部类对象，才能创建内部类对象。
        OuterClass.InnerClass ic = oc.new InnerClass();// 使用外部类对象.new的方式创建内部类对象。
        OuterClass.InnerClass ic2 = new OuterClass().new InnerClass();// 先创建外部类对象，在创建内部类对象。

        ic.innerMtehod();
    }
}
