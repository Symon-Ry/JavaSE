package com.atguigu.day14homework.test1;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/10 18:36
 */
public class Test {
    public static void main(String[] args) {
        Integer[] a = new Integer[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        int del = 2;
        int num = a[0];

            while (a[del] != null) {
                num = a[del];
                a[del] = null;
                if (del > a.length - 4) {
                    if (a[3 - (a.length - del)] != null) {
                        del = 3 - (a.length - del);
                    }
                } else {
                    del += 3;
                }
            }
        System.out.println("最后的下标" + del);
        System.out.println("最后的值" + num);

        System.out.println("最后的数组" + Arrays.toString(a));
    }
}
