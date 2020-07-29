package cn.atguigu.day04homework;

/**
 * @author Symon
 */
public class Test7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
