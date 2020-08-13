package com.atguigu.entity;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className InsertTest
 * @description TODO
 * @date 2020/8/10 11:14
 */
public class InsertTest {
    @Test
    public void test() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] ints = insert(arr, 999, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ints));
    }

    public int[] insert(int[] arr, int value, int index) {
        int[] ints = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            ints[i] = arr[i];
        }
        for (int i = index + 1; i < ints.length; i++) {
            ints[i] = arr[i - 1];
        }
        ints[index] = value;

        return ints;
    }
}
