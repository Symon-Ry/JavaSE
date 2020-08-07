package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test02
 * @description TODO
 * @date 2020/8/3 19:37
 */
public class Test02 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}
class Father{
    int x = 10;
    public Father(){
        this.print();
        x = 20;
    }
    public void print(){
        System.out.println("Father.x = " + x);
    }
}
class Son extends Father{
    int x = 30;
    public Son(){
        this.print();
        x = 40;
    }
    @Override
    public void print(){
        System.out.println("Son.x = " + x);
    }
}
