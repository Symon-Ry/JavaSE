package com.atguigu.day15homework.test8;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 18:54
 */
public class Test {
    public static void main(String[] args) {
        String passWord = "at1Gui2Gu";
        boolean flag = false;
        int  num2 = 0, num3 = 0;
        for (int i = 0; i < passWord.length(); i++) {
            if (passWord.charAt(i) >= 'A' && passWord.charAt(i) <= 'Z') {
                num2++;
            }
            if (passWord.charAt(i) >= '0' && passWord.charAt(i) <= '9') {
                num3++;
            }
        }
        if (passWord.length() >= 9 && num2 >= 2 && num3 >= 1) {
            flag = true;
        }
        System.out.println("flag = " + flag);

    }
}
