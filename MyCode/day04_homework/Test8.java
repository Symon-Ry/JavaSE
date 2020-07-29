package cn.atguigu.day04homework;

/**
 * @author Symon
 */
public class Test8 {
    public static void main(String[] args) {
        //上半部分
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("O");
            for (int j = 5; j > 2*i; j--) {
                System.out.print("*");
            }
            if (i<3){
                System.out.print("O");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //下半部分
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2-i; j++) {
                System.out.print("*");
            }
            System.out.print("O");

            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.print("O");
            for (int j = 0; j < 2-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
