package cn.atguigu.day05homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Symon
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入组员人数：");
        int sum = input.nextInt();
        int[] arr = new int[sum];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个组员的成绩");
            arr[i] = input.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
