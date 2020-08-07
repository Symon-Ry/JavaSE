package com.atguigu.exer.exercise1;

/**
 * @author Symon
 * @version 1.0
 * @className Traffic
 * @description （1）声明抽象父类Traffic，包含抽象方法public abstract void drive()
 * （2）声明子类Car,Bicycle等，并重写drive方法
 * （3）在测试类的main中创建一个数组，有各种交通工具，遍历调用drive()方法
 * 模拟马路上跑的各种交通工具
 * @date 2020/8/2 15:46
 */
public abstract class Traffic {
    public abstract void drive();
}
