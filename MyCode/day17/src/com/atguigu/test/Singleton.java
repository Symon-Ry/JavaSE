package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className Singleton
 * @description TODO
 * @date 2020/8/13 17:01
 */
public class Singleton {
    public static void main(String[] args) {

    }
    private static final Singleton INSTACNE = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return INSTACNE;
    }
}