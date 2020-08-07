package com.atguigu.day12homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className Test04
 * @description TODO
 * @date 2020/8/5 21:10
 */
public class Test04 {
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        try{
            return ++i;
        }finally{
            return ++i;
        }
    }
}
