package cn.atguigu.day04homework;

/**
 * @author Symon
 */
public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("------------");
        while (a <= 5) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(b+" ");
            }
            System.out.println();
            a++;
        }
        System.out.println("------------");
    }
}
