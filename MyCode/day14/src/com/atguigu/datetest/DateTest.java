package com.atguigu.datetest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Symon
 * @version 1.0
 * @className DateTest
 * @description TODO
 * @date 2020/8/8 16:12
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

        String d = sdf.format(date);
        System.out.println(d);
    }
}
