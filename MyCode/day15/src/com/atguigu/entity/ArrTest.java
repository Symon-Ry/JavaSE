package com.atguigu.entity;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className ArrTest
 * @description TODO
 * @date 2020/8/10 9:25
 */
public class ArrTest {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}