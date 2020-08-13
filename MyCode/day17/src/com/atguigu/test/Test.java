package com.atguigu.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 9:35
 */
public class Test{
    public static long f(long i) {
        if (i == 1) {
            return 1;
        }
        long temp = 1;
        for (int j = 1; j <= i; j++) {
            temp *= j;
        }
        return f(i - 1) + temp;
    }

    public static void main(String[] args) {
        System.out.println(f(20));

        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            long temp = 1;
            for (int j = 1; j <=i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        System.out.println("sum = " + sum);
    }
}

class ImInter implements Inter {

    @Override
    public void print() {
        System.out.println("in ImInter");
    }
}

class ImIn implements In {

}

interface A{
    int x = 0;
}
class B{
    int xy = 1;
}
