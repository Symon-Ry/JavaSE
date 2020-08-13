package com.atguigu.calendartest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/8 16:15
 */
public class Test {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        String date = sdf.format(c.getTime());
        System.out.println(date);

        c.add(Calendar.DATE, 10000);
        System.out.println(sdf.format(c.getTime()));

        try {
            Date date1 = sdf.parse("2020-9-19 0:0:0");
            System.out.println(sdf.format(date1));
            System.out.println(date1.getTime()-c.getTime().getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
