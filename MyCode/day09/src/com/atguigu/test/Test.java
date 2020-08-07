package com.atguigu.test;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/1 12:41
 */
public class Test{
    public static void main(String[] args){
        Son3 s = new Son3();
        s.test();

        Daughter d = new Daughter();
        d.test();
    }
}
class Father3{
    protected int num = 10;
    public int getNum(){
        return num;
    }
}
class Son3 extends Father3{
    private int num = 20;

    @Override
    public int getNum() {
        return num;
    }

    public void test(){
        System.out.println(getNum());//10  本类没有找父类
        System.out.println(this.getNum());//10  本类没有找父类
        System.out.println(super.getNum());//10  直接找父类
    }
}
class Daughter extends Father3{
    private int num = 20;
    @Override
    public int getNum(){
        return num;
    }
    public void test(){
        System.out.println(getNum());//20  先找本类
        System.out.println(this.getNum());//20  先找本类
        System.out.println(super.getNum());//10  直接找父类
    }
}