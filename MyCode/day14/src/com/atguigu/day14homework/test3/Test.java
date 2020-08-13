package com.atguigu.day14homework.test3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/10 19:37
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(primeArrays(100)));
    }

    public static int[] primeArrays(int n) {
        if (n < 1) {
            return null;
        }
        if (n == 1) {
            return new int[]{1};
        }
        if (n == 2) {
            return new int[]{1,2};
        }
        if (n == 3) {
            return new int[]{1,2,3};
        }
        ArrayList<Integer> ints = new ArrayList<>();
        boolean isPrime;
        for (int i = 4; i <= n; i++) {
            isPrime = true;
            //除 2 到 n的平方根（包括）
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    //一旦被整除，返回false
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                ints.add(i);
            }
        }
        int[] arr = new int[ints.size()];
        for (int i = 0; i < ints.size(); i++) {
            arr[i] = ints.get(i);
        }
        return arr;
    }
}
