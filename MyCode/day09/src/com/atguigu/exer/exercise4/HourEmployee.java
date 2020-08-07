package com.atguigu.exer.exercise4;


/**
 * @author Symon
 * @version 1.0
 * @className HourEmployee
 * @description 3、声明一个子类HourEmployee小时工，继承父类Employee
 *  * 有属性，工作小时数，每小时多少钱
 *  * 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
 *  * 重写方法，public String getInfo()：显示姓名和实发工资，时薪，工作小时数
 *  * 增加方法，public void leave()：打印查看使用工具是否损坏，需要赔偿
 * @date 2020/8/2 16:09
 */
public class HourEmployee extends Employee{
    private int workHour;
    private double hourPrice;

    public HourEmployee() {
    }


    public HourEmployee(String name, MyDate bir, int workHour, double hourPrice) {
        super(name, bir);
        this.workHour = workHour;
        this.hourPrice = hourPrice;
    }

    public void leave(){
        System.out.println("查看使用工具是否损坏，需要赔偿");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，时薪：" + hourPrice + "，工作小时数：" + workHour;
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
