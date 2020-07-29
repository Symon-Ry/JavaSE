package cn.atguigu.day06homework.test5;

import java.util.concurrent.TransferQueue;

/**
 * @author Symon
 */
public class Test05 {
    public static void main(String[] args) {
        Truangle t1 = new Truangle();
        t1.a = 3;
        t1.b = 2;
        t1.c = 3;
        Truangle t2 = new Truangle();
        t2.a=3;
        t2.b=4;
        t2.c=5;
        Truangle t3 = new Truangle();
        t3.a=1;
        t3.b=1;
        t3.c=1;

        System.out.println("Truangle.isRightTriangle(t1) = " + Truangle.isRightTriangle(t1));
        System.out.println("Truangle.isRightTriangle(t2) = " + Truangle.isRightTriangle(t2));
        System.out.println("Truangle.isRightTriangle(t3) = " + Truangle.isRightTriangle(t3));

        System.out.println("------------------------------------------");
        System.out.println("Truangle.isIsoscelesTriangle(t1) = " + Truangle.isIsoscelesTriangle(t1));
        System.out.println("Truangle.isIsoscelesTriangle(t2) = " + Truangle.isIsoscelesTriangle(t2));
        System.out.println("Truangle.isIsoscelesTriangle(t3) = " + Truangle.isIsoscelesTriangle(t3));

        System.out.println("------------------------------------------");
        System.out.println("Truangle.isEequilateralTriangle(t1) = " + Truangle.isEequilateralTriangle(t1));
        System.out.println("Truangle.isEequilateralTriangle(t2) = " + Truangle.isEequilateralTriangle(t2));
        System.out.println("Truangle.isEequilateralTriangle(t3 = " + Truangle.isEequilateralTriangle(t3));

        System.out.println("------------------------------------------");
        System.out.println("Truangle.getArea(t1) = " + Truangle.getArea(t1));
        System.out.println("Truangle.getArea(t2) = " + Truangle.getArea(t2));
        System.out.println("Truangle.getArea(t3) = " + Truangle.getArea(t3));

        System.out.println("------------------------------------------");
        System.out.println("Truangle.getLength(t1) = " + Truangle.getLength(t1));
        System.out.println("Truangle.getLength(t2) = " + Truangle.getLength(t2));
        System.out.println("Truangle.getLength(t3) = " + Truangle.getLength(t3));

    }
}
