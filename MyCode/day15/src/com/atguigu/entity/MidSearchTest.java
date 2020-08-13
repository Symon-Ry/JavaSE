package com.atguigu.entity;

import org.junit.Test;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className MidSerchTest
 * @description TODO
 * @date 2020/8/10 14:18
 */
public class MidSearchTest {

    @Test
    public void test() {
        System.out.println(search(new int[]{1, 2, 3, 4, 5, 6, 7}, 99));
    }

    public int search(int[] arr, int value) {
        int left = 0, right = arr.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                left++;
            } else {
                right--;
            }
        }
        return -1;
    }
}
