package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test14
 * @description TODO
 * @date 2020/8/3 18:45
 */
public class Test14 {
    public static void main(String[] args) {
        Father14 f = new Father14();
        Son14 s = new Son14();
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
class Father14{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son14 extends Father14{
    private String info = "尚硅谷";
    @Override
    public void setInfo(String info){
        this.info = info;
    }
    @Override
    public String getInfo(){
        return info;
    }
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}
