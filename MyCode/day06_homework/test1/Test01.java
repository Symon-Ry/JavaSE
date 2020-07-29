package cn.atguigu.day06homework.test1;

/**
 * @author Symon
 */
public class Test01 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.empId = 1;
        emp1.empName = "张三";
        emp1.empAge = 23;
        emp1.empSalary=10000;
        emp2.empId = 2;
        emp2.empName = "李四";
        emp2.empAge = 22;
        emp2.empSalary=11000;
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
