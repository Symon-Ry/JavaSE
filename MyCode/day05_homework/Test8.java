package cn.atguigu.day05homework;

import java.util.Arrays;

/**
 * @author Symon
 */
public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1,0};
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                flag = false;
            }
        }
        System.out.println(Arrays.toString(arr) + "是否对称？" + flag);
    }
}
