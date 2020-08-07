package com.atguigu.exer.exercise3;

/**
 * @author Symon
 * @version 1.0
 * @className SalaryEmployee
 * @description 声明一个子类SalaryEmployee正式工，继承父类Employee，增加属性，薪资，工作日天数，请假天数
 *  * 重写方法，public double earning()返回实发工资，实发工资 = 薪资 - 薪资/工作日天数 * 请假天数，
 * @date 2020/8/2 16:01
 */
public class SalaryEmployee extends Employee {
    private double salary;
    private int workDays;
    private int leaveDays;

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name,double salary, int workDays, int leaveDays) {
        super(name);
        this.salary = salary;
        this.workDays = workDays;
        this.leaveDays = leaveDays;
    }

    @Override
    public double earning() {
        return salary - salary / workDays * leaveDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
