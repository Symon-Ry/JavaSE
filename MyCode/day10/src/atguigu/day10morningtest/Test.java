package atguigu.day10morningtest;


import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/3 8:42
 */
public class Test {
    public static void main(String[] args) {
        Teacher[] teas = new Teacher[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < teas.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个老师的名字：");
            String name = input.next();
            System.out.println("请输入第" + (i + 1) + "个老师的年龄：");
            int age = input.nextInt();
            teas[i] = new Teacher(name, age);
        }

        Manager manager = new Manager();
        for (Teacher tea : teas) {
            manager.toClass(tea);
        }
    }
}
