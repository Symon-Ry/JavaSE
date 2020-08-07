package com.atguigu.day12homework.test8.test9;

import sun.applet.Main;

import java.util.ArrayList;

/**
 * @author Symon
 * @version 1.0
 * @className OOMTest
 * @description TODO
 * @date 2020/8/6 10:10
 */
public class OOMTest {
    public static void main(String[] args) {
        final ArrayList<Main> objects = new ArrayList<Main>();
        while(true){
            objects.add(new Main());
        }
    }
}
