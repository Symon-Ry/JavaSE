package cn.atguigu.day07homework.test3;

import java.util.Arrays;

/**
 * @author Symon
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 23, 9, 5, 23, 6, 1};
        System.out.println(MyArrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2));
        System.out.println(MyArrays.binarySearch(new char[]{'a', 'b', 'c', 'q', 'x', 'y', 'z'}, 'q'));
        System.out.println(MyArrays.binarySearch(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2));

        System.out.println(Arrays.toString(MyArrays.copy(new int[]{1, 2, 3, 4}, 9)));

        MyArrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
