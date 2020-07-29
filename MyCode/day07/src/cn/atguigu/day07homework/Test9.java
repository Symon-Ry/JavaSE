package cn.atguigu.day07homework;

/**
 * @author Symon
 * 有n步台阶，一次只能上1步或2步，共有多少种走法？
 * f(n)=f(n-1)+f(n-2)
 */
public class Test9 {

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(3));
    }
}
