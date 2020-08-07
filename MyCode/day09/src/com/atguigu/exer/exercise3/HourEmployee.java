package com.atguigu.exer.exercise3;

/**
 * @author Symon
 * @version 1.0
 * @className HourEmployee
 * @description 3、声明一个子类HourEmployee小时工，继承父类Employee
 *  * 有属性，工作小时数，每小时多少钱
 *  * 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
 * @date 2020/8/2 16:09
 */
public class HourEmployee extends Employee{
    private int workHour;
    private double hourPrice;

    public HourEmployee() {
    }

    public HourEmployee(int workHour, double hourPrice) {
        this.workHour = workHour;
        this.hourPrice = hourPrice;
    }

    public HourEmployee(String name, int workHour, double hourPrice) {
        super(name);
        this.workHour = workHour;
        this.hourPrice = hourPrice;
    }

    @Override
    public double earning() {
        return workHour * hourPrice;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }
}
