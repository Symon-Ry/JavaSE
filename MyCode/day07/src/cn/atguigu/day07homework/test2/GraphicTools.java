package cn.atguigu.day07homework.test2;

/**
 * @author Symon
 * ​	声明一个图形工具类GraphicTools，包含如下方法：
 *
 * 1、void printRectangle()：该方法打印5行5列*矩形
 *
 * 2、void printRectangle(int line, int column, String sign)：该方法打印line行colomn列由sign组成的矩形
 *
 * 3、double getTriangleArea(double base, double height)：根据底边和底边对应的高求三角形面积
 *
 * 4、double getTriangleArea(double a, double b, double c)：根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
 *
 * ​	声明Test02测试类，并在main方法中调用测试
 */
public class GraphicTools {
    public static void printRectangle() {
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int i1 = 0; i1 < column; i1++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public static double getTriangleArea(double base, double height) {
        return base * height / 2;
    }

    public static double getTriangleArea(double a, double b, double c) {
        double num = (a + b + c);
        if (a + b > c && a + c > b && b + c > a) {
            return Math.sqrt(num / 2 * (num / 2 - a) * (num / 2 - b) * (num / 2 - c));
        } else {
            return 0;
        }
    }

}
