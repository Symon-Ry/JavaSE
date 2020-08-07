package com.atguigu.exer.exercise2;

/**
 * @author Symon
 * @version 1.0
 * @className Person
 * @description （1）声明一个抽象父类Person类，public abstract void toilet();
 * （2）声明一个子类Woman类，重写方法
 * （3）声明一个子类Man类，重写方法
 * （4）在测试类中声明一个方法，
 * public static void goToToilet(Person p){
 * p.toilet();
 * }
 * 在main中，创建不同子类对象，调用goToToilet方法进行测试
 * @date 2020/8/2 15:52
 */
public abstract class Person {
    public abstract void toilet();
}
