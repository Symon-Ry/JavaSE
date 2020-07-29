package cn.atguigu.day06homework.test2;

/**
 * @author Symon
 */
public class Test02 {
    public static void main(String[] args) {
        MyDate birth = new MyDate();
        MyDate comeGuiguDay = new MyDate();
        MyDate  graduateDay = new MyDate();

        birth.year = 1998;
        birth.month = 3;
        birth.day = 9;

        comeGuiguDay.year = 2020;
        comeGuiguDay.month = 7;
        comeGuiguDay.day = 17;

        graduateDay.year = 2021;
        graduateDay.month = 1;
        graduateDay.day = 1;

        System.out.println(birth);
        System.out.println(comeGuiguDay);
        System.out.println(graduateDay);
    }
}
