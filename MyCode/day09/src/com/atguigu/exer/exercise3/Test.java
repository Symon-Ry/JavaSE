package com.atguigu.exer.exercise3;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description 你现在是财务，需要查看每个人的实发工资，并查看工资总额。
 *  * 声明一个员工数组，存储各种员工，并遍历显示他们的姓名和实发工资，并计算所有员工的工资总额
 * @date 2020/8/2 16:19
 */
public class Test {
    public static void main(String[] args) {

        Employee[] employees = {new SalaryEmployee("salaryEmp1", 100.1, 23, 7), new HourEmployee("hourEmp1", 6, 23.1), new Manager("manager", 200.1, 20, 10, 0.10)};

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
        }
    }
}
