package cn.atguigu.day06homework.test1;

/**
 * @author Symon
 */
public class Employee {
    public int empId;
    public String empName;
    public int empAge;
    public double empSalary;

    @Override
    public String toString() {
        return "员工" + empId +
                "的编号：" + empId +
                ", 姓名：" + empName +
                ", 年龄：" + empAge +
                ", 薪资：" + empSalary;
    }
}
