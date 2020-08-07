package com.day11.morningtest;

public class Fish extends Animal implements Swim {
    @Override
    public void eat() {
        System.out.println("大鱼吃小鱼");
    }

    @Override
    public void swiming() {
        System.out.println("游泳~~");
    }
}
