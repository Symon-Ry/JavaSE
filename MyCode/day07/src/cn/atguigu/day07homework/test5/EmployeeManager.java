package cn.atguigu.day07homework.test5;

import java.util.Arrays;

/**
 * @author Symon
 * 声明一个EmployeeManager类，包含如下方法：
 * * <p>
 * * ​	（1）public void print(Emplyee[] all)：遍历打印员工数组中的每个员工的详细信息
 * * <p>
 * * ​	（2）public void sort(Employee[] all)：将all员工数组按照年龄从高到低排序
 * * <p>
 * * ​	（3）public void addSalary(Employee[] all, double increament)：将all员工数组的每一个员工的工资，增加increament
 */
public class EmployeeManager {

    public void print(Employee[] all) {
        for (Employee employee : all) {
            employee.printInfo();
        }
    }

    public void sort(Employee[] all) {
        Employee e = all[0];
        for (int i = 0; i < all.length - 1; i++) {
            for (int j = 0; j < all.length - i - 1; j++) {
                if (all[j].age > all[j + 1].age) {
                    e = all[j];
                    all[j] = all[j + 1];
                    all[j + 1] = e;
                }
            }
        }
    }

    public void addSalary(Employee[] all, double increament) {
        for (int i = 0; i < all.length; i++) {
            all[i].salary += increament;
        }
    }
}
