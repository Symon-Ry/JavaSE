package com.atguigu.exer.exercise4;


/**
 * @author Symon
 * @version 1.0
 * @className Manager
 * @description 声明一个子类Manager经理，继承SalaryEmployee，增加属性：奖金比例
 *  * 重写方法，public double earning()返回实发工资，实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例)
 *  * 重写方法，public String getInfo()：显示姓名和实发工资，月薪，工作日天数，请假天数，奖金比例
 * @date 2020/8/2 16:12
 */
public class Manager extends SalaryEmployee{

    private double moneyProp;

    @Override
    public String getInfo() {
        return super.getInfo() + ",奖金比例：" + moneyProp;
    }

    @Override
    public double earning() {
        return (getSalary() - getSalary() / getWorkDays() * getLeaveDays()) * (1 + moneyProp);
    }



    public Manager(String name, MyDate bir, double salary, int workDays, int leaveDays, double moneyProp) {
        super(name, bir, salary, workDays, leaveDays);
        this.moneyProp = moneyProp;
    }
}
