package com.atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className StringTest
 * @description TODO
 * @date 2020/8/11 10:16
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "mmm.Java";
        System.out.println(isJava(str));
    }

    public static boolean isJava(String str) {
        if (str.substring(str.length() - 5).equalsIgnoreCase(".java")) {
            return true;
        }
        return false;
    }
}
