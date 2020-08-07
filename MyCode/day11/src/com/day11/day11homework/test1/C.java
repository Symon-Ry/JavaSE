package com.day11.day11homework.test1;

/**
 * @author Symon
 * @version 1.0
 * @className A
 * @description TODO
 * @date 2020/8/5 18:40
 */
public class C extends B implements A{
    public void printX(){
        //System.out.println(x); //编译错误
    }
    public static void main(String[] args) {
        new C().printX();
    }
}
interface A{
    int x = 0;
}
class B{
    int x = 1;
}

