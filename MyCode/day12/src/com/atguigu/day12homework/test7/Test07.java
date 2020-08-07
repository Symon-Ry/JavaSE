package com.atguigu.day12homework.test7;

/**
 * @author Symon
 * @version 1.0
 * @className Test07
 * @description TODO
 * @date 2020/8/5 21:16
 */
public class Test07 {
    public static int aMethod(int i)throws Exception{
        try{
            return 10 / i;
        }catch(Exception ex){
            throw new Exception("exception in aMethod");
        }finally{
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception e) {
            System.out.println("exception in main");
        }
    }
}
