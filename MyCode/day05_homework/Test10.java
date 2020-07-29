package cn.atguigu.day05homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Symon
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入组员的人数：");
        int len = input.nextInt();
        String[] names = new String[len];
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个组员的名字：");
            names[i] = input.next();
        }
        System.out.println("请输入需要查询的组员名字：");
        String name = input.next();
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println("下标为：" + i);
            }
        }
    }
}
