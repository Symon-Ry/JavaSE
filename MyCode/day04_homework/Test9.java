package cn.atguigu.day04homework;

/**
 * @author Symon
 */
public class Test9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i+1; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("\t");
            }

            for (int j = 5; j >= 2*i-1; j--) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
