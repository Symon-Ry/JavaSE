package cn.atguigu.day06homework.test3;

import cn.atguigu.day06homework.test2.MyDate;

/**
 * @author Symon
 * 声明公民类Citizen，包含属性：姓名，生日，身份证号，
 * 其中姓名是String类型，生日是MyDate类型，身份证号也是String类型。
 *
 * 声明Test03测试类，在main方法中创建你们家庭成员的几个对象，并打印信息。
 */
public class Citizen {
    public String name;
    public MyDate bir;
    public String id;

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", bir=" + bir +
                ", id='" + id + '\'' +
                '}';
    }
}
