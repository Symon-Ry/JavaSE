package cn.atguigu.day06homework.test7;

import java.util.Arrays;

/**
 * @author Symon
 */
public class Test07 {
    public static void main(String[] args) {
        int[] copy = MyArrays.copy(new int[]{23,45,32,1}, 5);
        System.out.println(Arrays.toString(copy));

        int i = MyArrays.indexOf(copy, 4);
        System.out.println(i);

        MyArrays.sort(copy);
    }
}
