package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test12
 * @description TODO
 * @date 2020/8/3 21:12
 */
public class Test12 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println(t.getArea());
        System.out.println(t.getPiremeter());
    }
}

class Triangle {
    private double a,b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double avg = (this.getA() + this.getB() + this.getC()) / 2.0;
        return Math.sqrt(avg * (avg - this.getA()) * (avg - this.getB()) * (avg - this.getC()));
    }

    public double getPiremeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) {
            return false;
        }
        if (b != triangle.b) {
            return false;
        }
        return c == triangle.c;
    }




    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
