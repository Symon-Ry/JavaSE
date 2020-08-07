package com.atguigu.day12homework.test5;

import java.io.IOException;

/**
 * @author Symon
 * @version 1.0
 * @className Test05
 * @description TODO
 * @date 2020/8/5 21:14
 */
public class Test05 {
    public static void main(String[] args) {
        int a = -1;
        try{
            if(a>0){
                throw new RuntimeException("");
            }else if(a<0){
                throw new IOException("");
            }else{
                return ;
            }
        }catch(IOException ioe){
            System.out.println("IOException");
        }catch(Throwable e){
            System.out.println("Throwable");
        }finally{
            System.out.println("finally");
        }
    }
}
