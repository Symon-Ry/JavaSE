package com.atguigu.day14homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className BinarySearch
 * @description TODO
 * @date 2020/8/10 19:28
 */
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 0));
    }

    public static int binarySearch(int[] insArray, int des) {
        int left = 0, right = insArray.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (des == insArray[mid]) {
                return mid;
            } else if (des > insArray[mid]) {
                left ++;
            } else {
                right --;
            }
        }
        return -1;
    }
}
