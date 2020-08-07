package com.atguigu.exer.exercise4;


import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description 5、声明一个员工数组，存储各种员工，
 *  * 你现在是人事，从键盘输入当前的月份，需要查看每个人的详细信息。
 *  * 如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，
 *  祝福生日快乐，通知领取生日礼物。如果是HourEmployee显示小时工，就进行完工检查，即调用leave方法
 * @date 2020/8/2 16:47
 */
public class Test {
    public static void main(String[] args) {

        Employee semp = new SalaryEmployee("semp", new MyDate(1998, 1, 1), 9000, 23, 7);

        Employee hemp = new HourEmployee("hemp", new MyDate(2000, 12, 12), 360, 20);

        Manager manager = new Manager("manager", new MyDate(1998, 12, 5), 10000, 30, 0, 0.5);

        Employee[] employees = {semp, hemp, manager};

        Scanner input = new Scanner(System.in);
        System.out.print("输入当前月份：");
        int month = input.nextInt();
        System.out.println("-----------------------------");
        for (Employee employee : employees) {
            if (employee instanceof SalaryEmployee) {
                System.out.println(employee.getInfo());
                if (employee.getBir().getMonth() == month) {
                    System.out.println("祝福生日快乐，通知领取生日礼物");
                }
                System.out.println("-----------------------------");
            }
            if (employee instanceof HourEmployee) {
                System.out.println(employee.getInfo());
                ((HourEmployee) employee).leave();
                System.out.println("-----------------------------");
            }
        }
    }
}
