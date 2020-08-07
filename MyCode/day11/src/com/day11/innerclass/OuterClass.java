package com.day11.innerclass;

public class OuterClass {

    private int outerFiled;

    public int getOuterFiled() {
        return outerFiled;
    }

    public void setOuterFiled(int outerFiled) {
        this.outerFiled = outerFiled;
    }

    // 成员内部类
    public class InnerClass {
        private int innerFiled;

        // private static int s;//成员内部类中不允许声明静态的属性或者方法。

        public void innerMtehod(){
            InnerClass ic = new InnerClass();// 内部类在外部类中可以直接创建对象。
            System.out.println("in inner method innerMtehod()");
            innerFiled = 10;// 内部类的方法可以访问内部类的成员
            System.out.println(outerFiled);
            outerFiled = 20;// 内部类可以访问外部类的私有成员。
            System.out.println(outerFiled);
            System.out.println(innerFiled);
            outerMethod();// 内部类可以访问外部类的成员。
            innerMethodTwo();
        }

        public void innerMethodTwo(){
            System.out.println("in inner method innerMethodTwo()");
        }
    }

    public void outerMethod(){
//        outerFiled = 100;// 外部类可以访问外部类的成员
//        innerFiled = 200;// 外部类不能直接访问内部类成员
//        System.out.println(innerFiled);
        System.out.println("in outer method outerMethod()");
        System.out.println(outerFiled);
    }

}
