package cn.atguigu.day03homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入a：");
        double a=input.nextDouble();
        System.out.print("请输入b：");
        double b=input.nextDouble();
        System.out.print("请输入c：");
        double c=input.nextDouble();
        double num=b*b-4*a*c;

        if (a == 0 && b != 0) {
            System.out.println("一个解："+-c/b);
            System.exit(0);
        }
        if (num > 0) {
            System.out.println("两个解："+(-b+Math.sqrt(b*b-4*a*c))+"和"+(-b-Math.sqrt(b*b-4*a*c)));
        } else if (num < 0) {
            System.out.println("无解");
        }else{
            System.out.println("一个解："+(-b/2*a));
        }

    }
}
