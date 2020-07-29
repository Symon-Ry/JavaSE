package cn.atguigu.day04homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test5 {
    public static int daysSum(int year,int month,int day){
        int days=0;
        for (int i = 2000; i < year; i++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                days += 366;
            }else {
                days += 365;
            }
        }
        switch (month-1) {
            case 12:
                days+=31;
            case 11:
                days+=30;
            case 10:
                days+=31;
            case 9:
                days+=30;
            case 8:
                days+=31;
            case 7:
                days+=31;
            case 6:
                days+=30;
            case 5:
                days+=31;
            case 4:
                days+=30;
            case 3:
                days+=31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                }else{
                    days += 28;
                }
            case 1:
                days+=31;
            case 0:
                days+=0;
                break;
            default:
                System.out.println("Erro!");
        }

        return days+day;
    }
    public static void main(String[] args) {
        System.out.println("请输入年、月、日：");
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
        int month=input.nextInt();
        int day = input.nextInt();
        int days = 0;
        switch (month-1) {
            case 12:
                days+=31;
            case 11:
                days+=30;
            case 10:
                days+=31;
            case 9:
                days+=30;
            case 8:
                days+=31;
            case 7:
                days+=31;
            case 6:
                days+=30;
            case 5:
                days+=31;
            case 4:
                days+=30;
            case 3:
                days+=31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days += 29;
                }else{
                    days += 28;
                }
            case 1:
                days+=31;
            case 0:
                days+=0;
                break;
            default:
                System.out.println("Erro!");
        }
        System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+(days+day)+"天");

    }
}
