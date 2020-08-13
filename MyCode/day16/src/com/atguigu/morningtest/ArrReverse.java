package com.atguigu.morningtest;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className ArrReverse
 * @description TODO
 * @date 2020/8/11 8:35
 */
public class ArrReverse {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(ints));
    }
}
