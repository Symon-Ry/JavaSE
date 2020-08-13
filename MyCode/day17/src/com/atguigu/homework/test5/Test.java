package com.atguigu.homework.test5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 19:31
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            str.add(((char) (Math.random() * 26 + 'a')) + "");
        }
        System.out.println(str);
        System.out.println(listTest(str, "a"));
        System.out.println(listTest(str, "b"));
        System.out.println(listTest(str, "c"));
        System.out.println(listTest(str, "x"));

    }

    public static int listTest(Collection<String> list,String s) {
        System.out.print(s + ":");
        int count = 0;
        for (String str : list) {
            if (str.equals(s)) {
                count++;
            }
        }
        return count;
    }
}
