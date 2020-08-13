package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className In
 * @description TODO
 * @date 2020/8/12 9:36
 */
public interface In {
    default Inter inter() {
        return new Inter() {
            @Override
            public void print() {
                System.out.println("in In");
            }
        };
    }
}
