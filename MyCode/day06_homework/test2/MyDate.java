package cn.atguigu.day06homework.test2;

/**
 * @author Symon
 * 声明一个日期类MyDate，包含属性：年、月、日
 *声明一个Test02测试类，并在main方法中，创建3个日期对象，
 * 一个是你的出生日期，一个是来尚硅谷的日期，一个是毕业的日期，并打印显示
 */
public class MyDate {
    public int year;
    public int month;
    public int day;

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
