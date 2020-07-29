package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println(num+"是整数");
        }else {
            System.out.println(num+"是奇数");
        }
    }
}
