package com.atguigu.exer.exercise4;

/**
 * @author Symon
 * @version 1.0
 * @className Employee
 * @description 1、声明一个父类Employee员工类型，
 * 有属性，姓名（String），出生日期（MyDate类型，也是自定义的含年，月，日属性日期类型）
 * 有方法，public abstract double earning()
 * 		public String getInfo()：显示姓名和实发工资
 *
 * 2、声明一个子类SalaryEmployee正式工，继承父类Employee
 * 增加属性，薪资，工作日天数，请假天数
 * 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 - 薪资/工作日天数 * 请假天数，
 * 重写方法，public String getInfo()：显示姓名和实发工资，月薪，工作日天数，请假天数
 *
 * 3、声明一个子类HourEmployee小时工，继承父类Employee
 * 有属性，工作小时数，每小时多少钱
 * 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
 * 重写方法，public String getInfo()：显示姓名和实发工资，时薪，工作小时数
 * 增加方法，public void leave()：打印查看使用工具是否损坏，需要赔偿
 *
 * 4、声明一个子类Manager经理，继承SalaryEmployee
 * 增加属性：奖金，奖金比例
 * 重写方法，public double earning()返回实发工资， 实发工资 = (薪资 - 薪资/工作日天数 * 请假天数)*(1+奖金比例)
 * 重写方法，public String getInfo()：显示姓名和实发工资，月薪，工作日天数，请假天数，奖金比例
 *
 * 5、声明一个员工数组，存储各种员工，
 * 你现在是人事，从键盘输入当前的月份，需要查看每个人的详细信息。
 * 如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，祝福生日快乐，通知领取生日礼物。如果是HourEmployee显示小时工，就进行完工检查，即调用leave方法
 * @date 2020/8/2 16:27
 */
public abstract class Employee {


    private String name;

    private MyDate bir;

    public Employee() {
    }

    public Employee(String name, MyDate bir) {
        this.name = name;
        this.bir = bir;
    }

    public Employee(String name) {
        this.name = name;
    }

    public abstract double earning() ;

    public String getInfo() {
        return "姓名：" + name + ",实发工资：" + earning();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBir() {
        return bir;
    }

    public void setBir(MyDate bir) {
        this.bir = bir;
    }
}
