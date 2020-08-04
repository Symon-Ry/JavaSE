package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test13
 * @description TODO
 * @date 2020/8/3 18:21
 */
public class Test13 {
    public static void main(String[] args) {
        Father13 f = new Father13();
        Son13 s = new Son13();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.test();
    }
}
class Father13{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son13 extends Father13{
    private String info = "尚硅谷";

    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
