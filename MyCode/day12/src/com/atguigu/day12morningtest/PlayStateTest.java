package com.atguigu.day12morningtest;


import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className PlayStateTest
 * @description TODO
 * @date 2020/8/5 8:42
 */
public class PlayStateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String value = input.next();

        PlayState ps = PlayState.valueOf(value);

        System.out.println(ps.toString());
    }
}
