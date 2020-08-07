package com.atguigu.exer.exercise3;

/**
 * @author Symon
 * @version 1.0
 * @className Employee
 * @description 1、声明一个父类Employee员工类型，有属性，姓名（String）
 * 有方法，public abstract double earning() 用于返回实发工资
 * 		public String getInfo()：显示姓名和实发工资
 *
 * 2、声明一个子类SalaryEmployee正式工，继承父类Employee，增加属性，薪资，工作日天数，请假天数
 * 重写方法，public double earning()返回实发工资，实发工资 = 薪资 - 薪资/工作日天数 * 请假天数，
 *
 * 3、声明一个子类HourEmployee小时工，继承父类Employee
 * 有属性，工作小时数，每小时多少钱
 * 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
 *
 * 4、声明一个子类Manager经理，继承SalaryEmployee，增加属性：奖金比例
 * 重写方法，public double earning()返回实发工资，实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例)
 *
 * 5、你现在是财务，需要查看每个人的实发工资，并查看工资总额。
 * 声明一个员工数组，存储各种员工，并遍历显示他们的姓名和实发工资，并计算所有员工的工资总额
 * @date 2020/8/2 15:58
 */
public abstract class Employee {
    private String name;

    public abstract double earning();

    public String getInfo() {
        return "姓名：" + name + "，实发工资：" + earning();
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }
}
