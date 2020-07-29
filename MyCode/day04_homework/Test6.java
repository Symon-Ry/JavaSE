package cn.atguigu.day04homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("请输入年、月、日：");
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
        int month=input.nextInt();
        int day = input.nextInt();
        int daysSum = Test5.daysSum(year, month, day);
        if (daysSum % 5 >= 1 && daysSum % 5 <= 3) {
            System.out.println("打鱼");
        }else {
            System.out.println("晒网");
        }
    }
}
