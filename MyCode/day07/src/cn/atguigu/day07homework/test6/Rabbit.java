package cn.atguigu.day07homework.test6;

/**
 * @author Symon
 */
public class Rabbit {
    public static int sum = 2;

    public static int increace(int month) {

        if (month == 0) {
            return 2;
        } else {
            return 2 * increace(month - 1);
        }
    }
    //4,8,16,32...
    //f(n)=2*f(n-1)

    public static void main(String[] args) {
        System.out.println(increace(4));
    }

}
