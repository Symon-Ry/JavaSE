package cn.atguigu.day06homework.test4;

/**
 * @author Symon
 */
public class Test04 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        date.year=2020;
        date.month=7;
        date.day=28;

        boolean isLeap = date.isLeapYear(date);
        System.out.println(isLeap);
        date.puls(2, 0, 0);
        System.out.println(date);
        date.set(2000, 4, 32);
        System.out.println(date);
    }
}
