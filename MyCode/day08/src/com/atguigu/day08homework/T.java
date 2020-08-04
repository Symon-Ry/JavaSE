package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className T
 * @description TODO
 * @date 2020/7/31 20:39
 */
public class T {
    public static int k = 0;
    public static T t1 = new T("t1");
    public static T t2 = new T("t2");
    public static int i = print("i");
    public static int n = 99;

    public int j = print("j");
    {
        print("构造块");
    }

    static{
        print("静态块");
    }
    public T(String str){
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        ++i;
    }
    public static int print(String str){
        System.out.println((++k) + ":" + str + "  i=" + i + "  n=" + n);
        ++n;
        return ++i;
    }
    public static void main(String[] args) {

    }
}
