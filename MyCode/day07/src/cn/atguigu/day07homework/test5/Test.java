package cn.atguigu.day07homework.test5;

/**
 * @author Symon
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 0;
        employee.name = "e0";
        employee.salary = 100;
        employee.age = 33;
        Employee employee1 = new Employee();
        employee1.id = 10;
        employee1.name = "e01";
        employee1.salary = 1001;
        employee1.age = 10;
        Employee employee2 = new Employee();
        employee2.id = 20;
        employee2.name = "e02";
        employee2.salary = 2100;
        employee2.age = 20;
        Employee employee3 = new Employee();
        employee3.id = 30;
        employee3.name = "e03";
        employee3.salary = 9100;
        employee3.age = 30;
        Employee employee4 = new Employee();
        employee4.id = 40;
        employee4.name = "e04";
        employee4.salary = 4100;
        employee4.age = 5;

        Employee[] employees = new Employee[5];
        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;
        employees[3] = employee3;
        employees[4] = employee4;

        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.sort(employees);
        employeeManager.print(employees);
        employeeManager.addSalary(employees, 1000);
        System.out.println("-------------------------");
        employeeManager.print(employees);


    }
}
