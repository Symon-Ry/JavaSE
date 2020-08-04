package com.atguigu.test16;

/**
 * @author Symon
 * @version 1.0
 * @className Designer
 * @description TODO
 * @date 2020/8/3 19:12
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, String language, double bonus) {
        super(id, name, age, salary, language);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "\t" + bonus;
    }
}
