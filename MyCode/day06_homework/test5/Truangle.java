package cn.atguigu.day06homework.test5;

/**
 * @author Symon
 * 声明一个三角形类Triangle，包含属性：a,b,c，表示三条边，包含几个方法：
 *
 * 1、boolean  isRightTriangle()：判断是否是一个直角三角形
 *
 * 2、boolean isIsoscelesTriangle()：判断是否是一个等腰三角形
 *
 * 3、boolean isEquilateralTriangle()：判断是否是一个等边三角形
 *
 * 4、double getArea()：根据三条边，用海伦公式求面积
 *
 * 5、double getLength()：求周长
 *
 * ​	并在测试类Test05的main方法中调用测试
 */
public  class Truangle {
    public double a, b, c;

    public static boolean isRightTriangle(Truangle truangle) {
        if (Math.pow(truangle.a, 2) + Math.pow(truangle.b, 2) == Math.pow(truangle.c, 2)||
                Math.pow(truangle.a, 2) + Math.pow(truangle.c, 2) == Math.pow(truangle.b, 2)||
                Math.pow(truangle.b, 2) + Math.pow(truangle.c, 2) == Math.pow(truangle.a, 2)) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isIsoscelesTriangle(Truangle truangle) {
        if (truangle.a == truangle.b || truangle.a == truangle.c || truangle.b == truangle.c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEequilateralTriangle(Truangle truangle) {
        if (truangle.a == truangle.b && truangle.b == truangle.c) {
            return true;
        } else {
            return false;
        }
    }

    public static double getArea(Truangle truangle) {
        double num = (truangle.a + truangle.b + truangle.c);
        return Math.sqrt(num / 2 * (num / 2 - truangle.a) * (num / 2 - truangle.b) * (num / 2 - truangle.c));
    }

    public static double getLength(Truangle truangle) {
        return truangle.a + truangle.b + truangle.c;
    }
}
