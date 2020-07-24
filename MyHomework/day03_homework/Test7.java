package cn.atguigu.day03homework;

import com.sun.deploy.security.DeploySSLCertStore;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month=input.nextInt();
        if(month<=0){
            System.out.println("月份输入错误");
            System.exit(0);
        }
        System.out.print("请输入日期：");
        int day=input.nextInt();
        if (day<=0){
            System.out.println("日期输入错误");
            System.exit(0);
        }
        int months=0;
        switch (month) {
            case 1:
                months=0;
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                break;
            case 2:
                if (day>28){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31;
                break;
            case 3:
                if (day>31){
                System.out.println("日期输入错误");
                System.exit(0);
                }
                months=31+28;
                break;
            case 4:
                if (day>30){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31;
                break;
            case 5:
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30;
                break;
            case 6:
                if (day>30){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31;
                break;
            case 7:
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30;
                break;
            case 8:
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30+31;
                break;
            case 9:
                if (day>30){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30+31+31;
                break;
            case 10:
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30+31+31+30;
                break;
            case 11:
                if (day>30){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30+31+31+30+31;
                break;
            case 12:
                if (day>31){
                    System.out.println("日期输入错误");
                    System.exit(0);
                }
                months=31+28+31+30+31+30+31+31+30+31+30;
                break;
            default:
                System.out.println("月份输入错误");
                System.exit(0);
        }
        int days=months+day;
        char week=(char)(days%7+1);
        if (week == 7) {
            week='日';
        }
        System.out.println(month+"月"+day+"日是星期"+week);
    }
}
