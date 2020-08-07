package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test14
 * @description TODO
 * @date 2020/8/4 20:43
 */
public class Test14 {

    public static void main(String[] args) {
        System.out.println(new Triangle14(3, 4, 5).getInfo());

        System.out.println(new Rectangle(11, 12).getInfo());

        System.out.println(new Circle(6).getInfo());
    }
}


abstract class Graphic {
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getInfo();
}

class Circle extends Graphic{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String getInfo() {
        return "圆的半径为：" + radius + "，面积为：" + getArea() + "，周长为" + getPerimeter();
    }
}

class Rectangle extends Graphic {

    private double width, hight;

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return width * hight;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * hight);
    }

    @Override
    public String getInfo() {
        return "矩形长宽分别为：" + width + "、" + hight + "，面积为：" + getArea();
    }
}

class Triangle14 extends Graphic {
    private double a, b, c;

    public Triangle14(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double i = (a + b + c) / 2;
        return Math.sqrt(i * (i - a) * i * (i - b) * i * (i - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getInfo() {
        return "三角形的三边分别为：" + a + "\t" + b + "\t" + c + "\n" +
                "面积为：" + getArea() + "，周长为：" + getPerimeter();
    }
}
