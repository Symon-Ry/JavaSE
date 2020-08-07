package com.day11.morningtest;

public class Bird extends Animal implements Fly {

    @Override
    public void eat() {
        System.out.println("吃小虫子");
    }

    @Override
    public void flying() {
        System.out.println("飞行~~");
    }
}
