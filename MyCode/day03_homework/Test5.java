package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
        switch (year % 12) {
            case 1:
                System.out.println("🐔");
                break;
            case 2:
                System.out.println("🐶");
                break;
            case 3:
                System.out.println("🐖");
                break;
            case 4:
                System.out.println("🐀");
                break;
            case 5:
                System.out.println("🐂");
                break;
            case 6:
                System.out.println("🐅");
                break;
            case 7:
                System.out.println("🐇");
                break;
            case 8:
                System.out.println("🐉");
                break;
            case 9:
                System.out.println("🐍");
                break;
            case 10:
                System.out.println("🐎");
                break;
            case 11:
                System.out.println("🐏");
                break;
            case 0:
                System.out.println("🐒");
                break;
            default:
                break;
        }
    }
}
