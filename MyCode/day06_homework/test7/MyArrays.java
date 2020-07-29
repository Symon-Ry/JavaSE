package cn.atguigu.day06homework.test7;

import java.util.Arrays;

/**
 * @author Symon
 * 声明一个数组管理工具类MyArrays，包含如下方法：
 *
 * 1、void sort(int[] arr)：可以为任意一维整型数组arr实现从小到大排序
 *
 * 2、int indexOf(int[] arr, int value)：可以在任意一维整型数组arr中查找value值的下标，如果不存在返回-1
 *
 * 3、int[] copy(int[] arr, int len)：可以实现从任意一维数组arr中复制一个新数组返回，新数组的长度为len，从arr[0]开始复制
 *
 * ​	声明一个Test07测试类，并在main方法中调用测试
 */
public class MyArrays {
    public static void sort(int[] arr){
        //void sort(int[] arr)：可以为任意一维整型数组arr实现从小到大排序
        int temp = 0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int indexOf(int[] arr, int value){
        //可以在任意一维整型数组arr中查找value值的下标，如果不存在返回-1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] copy(int[] arr, int len){
        //可以实现从任意一维数组arr中复制一个新数组返回，新数组的长度为len，从arr[0]开始复制
        int[] ints = new int[len];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[i];
        }
        return ints;
    }
}
