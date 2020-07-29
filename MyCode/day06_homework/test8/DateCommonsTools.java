package cn.atguigu.day06homework.test8;

/**
 * @author Symon
 * 声明一个常识工具类DateCommonsTools，包含如下方法：
 *
 * 1、String getWeekName(int week)：根据星期值，返回对应的英语单词
 *
 * 2、String getMonthName(int month)：根据月份值，返回对应的英语单词
 *
 * 3、int getTotalDaysOfMonth(int year, int month)：返回某年某月的总天数
 *
 * 4、int getTotalDaysOfYear(int year)：获取某年的总天数
 *
 * 5、boolean isLeapYear(int year)：判断某年是否是闰年
 *
 * ​	声明一个Test08测试类，并在main方法中调用测试
 */
public class DateCommonsTools {

    public static String getWeekName(int week){
        //根据星期值，返回对应的英语单词
        switch (week) {
            case 1:
                return "星期一";
            case 2:
                return "星期二";
            case 3:
                return "星期三";
            case 4:
                return "星期四";
            case 5:
                return "星期五";
            case 6:
                return "星期六";
            case 7:
                return "星期日";
            default:
                return "Error!";

        }
    }

    public static String getMonthName(int month){
        //根据月份值，返回对应的英语单词
        switch (month) {
            case 1:
                return "一月";
            case 2:
                return "二月";
            case 3:
                return "三月";
            case 4:
                return "四月";
            case 5:
                return "五月";
            case 6:
                return "六月";
            case 7:
                return "七月";
            case 8:
                return "八月";
            case 9:
                return "九月";
            case 10:
                return "十月";
            case 11:
                return "十一月";
            case 12:
                return "十二月";
            default:
                return "Error!";

        }
    }

    public static int getTotalDaysOfMonth(int year, int month){
        //返回某年某月的总天数
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else {
            return 30;
        }
    }

    public static int getTotalDaysOfYear(int year){
        //获取某年的总天数
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

    public static boolean isLeapYear(int year){
        //判断某年是否是闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
