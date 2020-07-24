package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        char ch = input.next().charAt(0);
        if(ch>='0'&&ch<='9'){
            System.out.println(ch+"是个数字");
        }else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.println(ch+"是个字母");
        }
    }
}
