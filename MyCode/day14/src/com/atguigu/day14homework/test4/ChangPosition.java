package com.atguigu.day14homework.test4;

import java.util.Arrays;

/**
 * @author Symon
 * @version 1.0
 * @className ChangPosition
 * @description TODO
 * @date 2020/8/10 20:06
 */
public class ChangPosition {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 8, 9, 10, 5};
        int[] ii = changPosition(1, 3, ints);
        System.out.println(Arrays.toString(ii));
    }

    public static int[] changPosition(int n1, int n2, int[] ints) {
        //int[] ints = Arrays.copyOf(ii,ii.length);
        int index1=0, index2=0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == n1) {
                index1 = i;
            }
            if (ints[i] == n2) {
                index2 = i;
            }
        }
        if (index1 < index2) {
            int temp = ints[index1];
            ints[index1] = ints[index2];
            ints[index2] = temp;
        }

        return ints;
    }
}
