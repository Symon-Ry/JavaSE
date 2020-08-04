package com.atguigu.day08homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test12
 * @description TODO
 * @date 2020/8/3 18:13
 */
public class Test12 {
    public static void main(String[] args) {
        Father12 f = new Father12();
        Son12 s = new Son12();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.setInfo("尚硅谷");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
    }
}
class Father12{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son12 extends Father12{

}