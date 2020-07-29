package cn.atguigu.day06homework.test4;

/**
 * @author Symon
 * 声明一个日期类MyDate，包含属性：年、月、日，并在MyDate类中声明几个方法：
 *
 * 1、boolean isLeapYear()：判断当前日期的是闰年吗？
 *
 * 2、void set(int y, int m, int d)：修改年，月，日为新日期
 *
 * 3、void puls(int years, int months, int days)：加上years年，months月，days天后的日期
 *
 * ​	并在测试类Test04的main方法中创建对象，并调用测试
 */
public class MyDate {
    public int year;
    public int month;
    public int day;

    public boolean isLeapYear(MyDate myDate) {
        if ((myDate.year % 4 == 0 && myDate.year % 100 != 0) || (myDate.year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public void set(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day=d;
    }

    public void puls(int years, int months, int days) {
        this.year += years;
        this.year += months;
        this.day += days;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
