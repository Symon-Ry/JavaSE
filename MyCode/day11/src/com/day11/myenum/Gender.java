package com.day11.myenum;

// 本类表示性别
public class Gender {

    // 提供公开静态的该类对象供外界访问
    public static final Gender man = new Gender("男");
    public static final Gender woman = new Gender("女");

    // 类中也可以声明普通的属性以便描述信息
    public String info;

    // 构造方法私有
    private Gender(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "info='" + info + '\'' +
                '}';
    }
}
