package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month,day;
        System.out.print("请输入月份：");
        month=scanner.nextInt();
        System.out.print("请输入日期：");
        day=scanner.nextInt();
        if (month == 1) {
            if (day <= 19) {
                System.out.println("生日" + month + "月" + day + "日是摩羯座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是水瓶座");
            }
        }else if (month == 2) {
            if (day <= 18) {
                System.out.println("生日" + month + "月" + day + "日是水瓶座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是双鱼座");
            }
        }
        if (month == 3) {
            if (day <= 20) {
                System.out.println("生日" + month + "月" + day + "日是双鱼座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是白羊座");
            }
        }
        if (month == 4) {
            if (day <= 19) {
                System.out.println("生日" + month + "月" + day + "日是白羊座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是金牛座");
            }
        }
        if (month == 5) {
            if (day <= 20) {
                System.out.println("生日" + month + "月" + day + "日是金牛座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是双子座");
            }
        }
        if (month == 6) {
            if (day <= 21) {
                System.out.println("生日" + month + "月" + day + "日是双子座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是巨蟹座");
            }
        }
        if (month == 7) {
            if (day <= 22) {
                System.out.println("生日" + month + "月" + day + "日是巨蟹座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是狮子座");
            }
        }
        if (month == 8) {
            if (day <= 22) {
                System.out.println("生日" + month + "月" + day + "日是狮子座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是处女座");
            }
        }
        if (month == 9) {
            if (day <= 22) {
                System.out.println("生日" + month + "月" + day + "日是处女座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是天秤座");
            }
        }
        if (month == 10) {
            if (day <= 23) {
                System.out.println("生日" + month + "月" + day + "日是摩羯座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是天蝎座");
            }
        }
        if (month == 11) {
            if (day <= 22) {
                System.out.println("生日" + month + "月" + day + "日是天蝎座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是射手座");
            }
        }
        if (month == 12) {
            if (day <= 21) {
                System.out.println("生日" + month + "月" + day + "日是射手座");
            } else {
                System.out.println("生日" + month + "月" + day + "日是摩羯座");
            }
        }
    }
}
