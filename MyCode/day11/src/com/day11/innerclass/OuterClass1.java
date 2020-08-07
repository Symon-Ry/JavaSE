package com.day11.innerclass;

public class OuterClass1 {

    private static int outerFiled;

    public int getOuterFiled() {
        return outerFiled;
    }

    public void setOuterFiled(int outerFiled) {
        OuterClass1.outerFiled = outerFiled;
    }

    // 静态内部类
    public static class InnerClass1 {
        private int innerFiled;

        public static int innerFiledTwo;

        // 内部类的静态成员不能访问普通成员，只能访问静态成员。
        public static void innerMethodThree(){
            System.out.println(innerFiledTwo);
            InnerClass1 ic = new InnerClass1();
            ic.innerMethodTwo();
        }
        // 静态内部类中不能访问外部类普通的属性和方法。
        public void innerMtehod(){
            System.out.println("in inner method innerMtehod()");
            innerFiled = 10;// 内部类的方法可以访问内部类的成员
            System.out.println(outerFiled);
            outerFiled = 20;// 内部类可以访问外部类的私有成员。
            System.out.println(outerFiled);
            System.out.println(innerFiled);
            outerMethod();// 内部类可以访问外部类的成员。
            innerMethodTwo();
            System.out.println(innerFiledTwo);
        }

        public void innerMethodTwo(){
            System.out.println("in inner method innerMethodTwo()");
        }
    }

    public static void outerMethod(){
//        outerFiled = 100;// 外部类可以访问外部类的成员
//        innerFiled = 200;// 外部类不能直接访问内部类成员
//        System.out.println(innerFiled);
        System.out.println("in outer method outerMethod()");
        System.out.println(outerFiled);
    }

}
