package com.atguigu.day12morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/5 8:37
 */
public class Test{

    public void test(){}

    public static void main(String[] args){
        Fly f=new Fly(){
            @Override
            public void flying(){
                System.out.println("flying inner");
            }
        };
        f.flying();
    }
}
interface Fly{

    public void flying();

}


