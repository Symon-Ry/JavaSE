package com.atguigu.morningtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className APITest
 * @description TODO
 * @date 2020/8/11 8:42
 */
public class APITest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Scanner input = new Scanner(System.in);
        System.out.println("Search num:");
        int i = input.nextInt();

        int index = Arrays.binarySearch(ints, i);
        /*int left = 0, right = ints.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (ints[mid] == i) {
                index = mid;
                break;
            } else if (ints[mid] < i) {
                left++;
            } else {
                right--;
            }
        }*/
        System.out.println("index = " + index);
    }
}
