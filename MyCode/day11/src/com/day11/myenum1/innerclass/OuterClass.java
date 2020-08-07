package com.day11.myenum1.innerclass;

/**
 * @author Symon
 * @version 1.0
 * @className OuterClass
 * @description TODO
 * @date 2020/8/4 15:10
 */
public class OuterClass {


    private int outerFiled;

    class InnerClass{

        private int innerFiled;

        public void innerMethod() {
            System.out.println("in inner Class");
            innerFiled = 10;

            //outerFiled = 20;

            System.out.println("innerFiled = " + innerFiled);
            System.out.println("outerFiled = " + outerFiled);
        }
    }

    public void outMethod() {
        System.out.println("in outer Class");
        outerFiled = 90;

        System.out.println("outerFiled = " + outerFiled);
    }
}
