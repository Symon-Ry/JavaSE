package com.atguigu.morningtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className ArrInsert
 * @description TODO
 * @date 2020/8/11 8:37
 */
public class ArrInsert {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Scanner input = new Scanner(System.in);
        System.out.println("Insert num:");
        int num = input.nextInt();
        System.out.println("Insert index:");
        int index = input.nextInt();

        int[] arr = Arrays.copyOf(ints, ints.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;

        System.out.println(Arrays.toString(arr));
    }
}
