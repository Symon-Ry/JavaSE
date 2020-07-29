package cn.atguigu.day07homework.test5;

/**
 * @author Symon
 * 1、声明一个Employee员工类，
 * <p>
 * ​		包含属性：编号(id)、姓名(name)、薪资(salary)、年龄(age)，此时属性不私有化
 * <p>
 * ​		包含方法：
 * <p>
 * ​		（1）void printInfo()：可以打印员工的详细信息
 * <p>
 * ​		（2）void setInfo(int  i, String n, double s, int a)：可以同时给id,name,salary,age赋值
 * <p>
 * ​	2、声明一个EmployeeManager类，包含如下方法：
 * <p>
 * ​	（1）public void print(Emplyee[] all)：遍历打印员工数组中的每个员工的详细信息
 * <p>
 * ​	（2）public void sort(Employee[] all)：将all员工数组按照年龄从高到低排序
 * <p>
 * ​	（3）public void addSalary(Employee[] all, double increament)：将all员工数组的每一个员工的工资，增加increament
 * <p>
 * ​	3、声明Test05测试类
 * <p>
 * （1）public static void main(String[] args)：在main方法中，创建Employee[]数组，并创建5个员工对象放到数组中，并为员工对象的属性赋值
 * <p>
 * （2）创建EmployeeManager对象，
 * <p>
 * （3）调用print方法，显示员工信息
 * <p>
 * （4）调用sort方法对员工数组进行按照年龄排序，并调用print方法，显示员工信息
 * <p>
 * （5）调用addSalary方法给每一个员工加薪1000元，并调用print方法，显示员工信息
 */
public class Employee {

    public int id;
    public String name;
    public double salary;
    public int age;

    public void printInfo() {
        System.out.println("编号：" + id + "，名字：" + name + "，薪资：" + salary + "，年龄：" + age);
    }

    public void setInfo(int i, String n, double s, int a) {
        this.id = i;
        this.name = n;
        this.salary = s;
        this.age = a;
    }
}
