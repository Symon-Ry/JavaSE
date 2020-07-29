package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总价格:");
        int totalPrice=scanner.nextInt();
        double discount=0;
        if (totalPrice >= 500) {
            discount=0.5;
        } else if (totalPrice>=400) {
            discount=0.6;
        } else if (totalPrice>=300) {
            discount=0.7;
        }else if (totalPrice>=200) {
            discount=0.8;
        }else if (totalPrice>=0) {
            discount=1;
        }else{
            System.out.println("输入有误");
            System.exit(0);
        }
        System.out.println("总价：" + totalPrice);
        System.out.println("折扣：" + discount);
        System.out.print("折扣后总价：" + totalPrice*discount);
    }
}
