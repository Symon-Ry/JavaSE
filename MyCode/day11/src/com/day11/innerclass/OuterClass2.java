package com.day11.innerclass;

public class OuterClass2 {

    private int outerFiled;

    public void methodOne(){
        int oneFiled = 0;
        // 局部内部类,只能在定义当前内部类的方法中使用，不能在其他方法中使用。
        class InnerClass2{
            public int innerFild;

            public void innerMethod(){
                System.out.println(oneFiled);
                System.out.println(innerFild);
                System.out.println(outerFiled);
                method();
                methodTwo();
            }

            public void method(){
                System.out.println("in method()");
            }
        }

        InnerClass2 ic2 = new InnerClass2();
        ic2.innerMethod();
    }

    public void methodTwo(){
        System.out.println("in methodTwo()");
    }

    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();
        oc.methodOne();
    }

}
