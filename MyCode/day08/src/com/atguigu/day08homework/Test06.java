package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test06
 * @description TODO
 * @date 2020/7/31 19:24
 */
public class Test06 {
    public static void main(String[] args) {
        Sub s = new Sub();

    }
}
class Base{
    Base(){
        //  this.method(100);调用当前对象的method，现在new子类对象，当前对象是子类，子类重写了method，这里执行子类的method
        method(100);
    }
    {
        System.out.println("base");
    }
    public void method(int i){
        System.out.println("base : " + i);
    }
}
class Sub extends Base{
    Sub(){
        super.method(70);
    }
    {
        System.out.println("sub");
    }
    @Override
    public void method(int j){
        System.out.println("sub : " + j);
    }
}
