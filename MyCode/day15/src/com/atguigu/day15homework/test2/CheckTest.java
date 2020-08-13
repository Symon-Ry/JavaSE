package com.atguigu.day15homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className CheckTest
 * @description TODO
 * @date 2020/8/10 20:51
 */
public class CheckTest {
    public static void main(String[] args) {
        System.out.println(check("0134511324"));
    }

    public static boolean check(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.charAt(0) == '0' || sb.length() > 12 || sb.length() < 5) {
            return false;
        }
        try {
            Integer integer = new Integer(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
