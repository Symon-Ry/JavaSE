package com.atguigu.exer.exercise1;

import javax.xml.transform.Source;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/2 15:48
 */
public class Test {
    public static void main(String[] args) {
        Traffic car = new Car();
        Traffic bicycle = new Bicycle();

        Traffic[] traffic = {car, bicycle, new Car(), new Bicycle()};

        for (int i = 0; i < traffic.length; i++) {
            traffic[i].drive();
        }
    }
}
