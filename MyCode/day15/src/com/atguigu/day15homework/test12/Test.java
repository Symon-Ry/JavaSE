package com.atguigu.day15homework.test12;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 20:06
 */
public class Test {
    public static void main(String[] args) {
        String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        String s = str.toLowerCase();
        char[] src = s.toCharArray();

        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i]=(char)('a' + i);
        }

        int[] count = new int[26];
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == src[i]) {
                    count[j]++;
                }
            }
        }

        int max = count[0];
        int index = 0;
        for (int i = 1; i < count.length; i++) {
            if (Math.max(max, count[i])>max) {
                max = Math.max(max, count[i]);
                index = i;
            }
        }

        System.out.println(chars[index] + ":" + count[index]);
    }
}
