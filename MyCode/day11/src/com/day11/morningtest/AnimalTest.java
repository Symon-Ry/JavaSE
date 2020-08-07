package com.day11.morningtest;

import java.util.Collection;

public class AnimalTest {
    public static void main(String[] args) {
        Animal one = new Fish();
        one.eat();
        Swim two = new Fish();
        two.swiming();
        Collection coll = null;
    }
}
