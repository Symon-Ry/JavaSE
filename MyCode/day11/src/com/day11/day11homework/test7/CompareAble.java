package com.day11.day11homework.test7;

public interface CompareAble {
    default void compare(Apple apple1, Apple apple2) {
        System.out.println(apple1.getSize() > apple2.getSize() ? apple1 : apple2);
    }
}
