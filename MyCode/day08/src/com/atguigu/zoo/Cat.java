package com.atguigu.zoo;

public class Cat extends Pet{

    public Cat(){
        super("加菲猫",5,"肥猫");
    }

    @Override
    public void play(){
        System.out.println("玩毛线球");
    }

}
