package com.atguigu.day12homework.test8;

/**
 * @author Symon
 * @version 1.0
 * @className Person
 * @description TODO
 * @date 2020/8/6 9:42
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NotLifeValueException("生命值不能为负数:" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
