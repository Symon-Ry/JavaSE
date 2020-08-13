package com.atguigu.day15homework.test7;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 18:39
 */
public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        String str = "mom";
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                flag = false;
            }
            left++;
            right--;
        }
        System.out.println("回文数：" + flag);
    }
}
