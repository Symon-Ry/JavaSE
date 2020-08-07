package com.atguigu.day12homework.test1;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/5 21:05
 */
public class Test {
    public static void main(String[] args) {
        int test = test(3,5);
        System.out.println(test);
    }

    public static int test(int x, int y){
        int result = x;
        try{
            if(x<0 || y<0){
                return 0;
            }
            result = x + y;
            return result;
        }finally{
            result = x - y;
        }
    }
}
