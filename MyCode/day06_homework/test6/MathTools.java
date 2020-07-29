package cn.atguigu.day06homework.test6;

/**
 * @author Symon
 * 声明一个数学计算工具类MathTools，包含如下方法：
 *
 * 1、int add(int a, int b)：求a+b
 *
 * 2、int subtract(int a,int b)：求a-b
 *
 * 3、int mutiply(int a, int b)：求a*b
 *
 * 4、int divide(int a, int b)：求a/b
 *
 * 5、int remainder(int a, int b)：求a%b
 *
 * 6、int max(int a, int b)：求a和b中的最大值
 *
 * 7、int min(int a, int b)：求a和b中的最小值
 *
 * 8、boolean equals(int a, int b)：判断a和b是否相等
 *
 * 9、boolean isEven(int a)：判断a是否是偶数
 *
 * 10、boolean isPrimeNumer(int a)：判断a是否是素数
 *
 * 11、int round(double d)：返回d的四舍五入后的整数值
 *
 * ​	声明一个Test06测试类，并在main方法中调用测试
 */
public class MathTools {


    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a,int b){
        return a - b;
    }
    public static int mutiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
    public static int remainder(int a, int b){
        return a % b;
    }
    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static int min(int a, int b){
        return Math.min(a, b);
    }
    public static boolean equals(int a, int b){
        return a == b;
    }
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
    public static boolean isPrimeNumer(int a){

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int round(double d){
        int a = (int) d;
        double b = d - a;
        return b >= 0.5 ? a + 1 : a;
    }

}
