package com.atguigu.day14homework.test5;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className MoveTest
 * @description TODO
 * @date 2020/8/10 20:15
 */
public class MoveTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(move(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
    }


    public static int[] move(int[] arr, int m) {
        for (int i = 0; i < m; i++) {
            int num = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = num;
        }

        return arr;
    }
}
