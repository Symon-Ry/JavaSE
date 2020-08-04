package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test10
 * @description TODO
 * @date 2020/8/3 17:56
 */
public class Test10 {
    public static void main(String[] args) {
        Other o = new Other();
        new Test10().addOne(o);
        System.out.println(o.i);
    }

    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}
