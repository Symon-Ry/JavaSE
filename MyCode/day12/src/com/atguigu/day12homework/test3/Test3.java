package com.atguigu.day12homework.test3;

/**
 * @author Symon
 * @version 1.0
 * @className Test3
 * @description TODO
 * @date 2020/8/5 21:07
 */
public class Test3 {
    {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    Test3(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
    }
}
