package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test13
 * @description TODO
 * @date 2020/8/4 19:02
 */
public class Test13 {

    static final int EMPLOYEE = 10;//表示普通员工
    static final int PROGRAMMER = 11;//表示程序员
    static final int DESIGNER = 12;//表示设计师
    static final int ARCHITECT = 13;//表示架构师

    public static void main(String[] args) {

        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };

        Employee[] emps = new Employee[12];

        for (int i = 0; i < emps.length; i++) {
            if (Integer.parseInt(EMPLOYEES[i][0]) == EMPLOYEE) {
                emps[i] = new Employee(Integer.parseInt(EMPLOYEES[i][1]), EMPLOYEES[i][2],
                        Integer.parseInt(EMPLOYEES[i][3]), Double.parseDouble(EMPLOYEES[i][4]));
            } else if (Integer.parseInt(EMPLOYEES[i][0]) == PROGRAMMER) {
                emps[i] = new Programmer(Integer.parseInt(EMPLOYEES[i][1]), EMPLOYEES[i][2],
                        Integer.parseInt(EMPLOYEES[i][3]), Double.parseDouble(EMPLOYEES[i][4]), "java");
            } else if (Integer.parseInt(EMPLOYEES[i][0]) == DESIGNER) {
                emps[i] = new Designer(Integer.parseInt(EMPLOYEES[i][1]), EMPLOYEES[i][2],
                        Integer.parseInt(EMPLOYEES[i][3]), Double.parseDouble(EMPLOYEES[i][4]), "java",
                        Double.parseDouble(EMPLOYEES[i][5]));
            } else if (Integer.parseInt(EMPLOYEES[i][0]) == ARCHITECT) {
                emps[i] = new Architect(Integer.parseInt(EMPLOYEES[i][1]), EMPLOYEES[i][2],
                        Integer.parseInt(EMPLOYEES[i][3]), Double.parseDouble(EMPLOYEES[i][4]), "java",
                        Double.parseDouble(EMPLOYEES[i][5]),Double.parseDouble(EMPLOYEES[i][5]));
            }
        }

        for (Employee e : emps) {
            System.out.println(e);
        }
    }
}


class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "编号=" + id +
                ", 名字=" + name +
                ", 年龄=" + age +
                ", 薪资=" + salary;
    }
}

class Programmer extends Employee {
    private String language;

    public Programmer(int id, String name, int age, double salary, String language) {
        super(id, name, age, salary);
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString()+", 使用语言=" + language;
    }


}

class Designer extends Programmer {
    private double bonus;

    public Designer(int id, String name, int age, double salary, String language, double bonus) {
        super(id, name, age, salary, language);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString()+", 奖金=" + bonus;
    }
}

class Architect extends Designer {
    private double stocks;

    public Architect(int id, String name, int age, double salary, String language, double bonus, double stocks) {
        super(id, name, age, salary, language, bonus);
        this.stocks = stocks;
    }

    @Override
    public String toString() {
        return super.toString()+", 股票=" + stocks;
    }
}
