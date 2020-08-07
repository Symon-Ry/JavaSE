package com.day11.day11homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className ShapTools
 * @description TODO
 * @date 2020/8/5 18:55
 */
public class ShapTools {
    @Deprecated
    public static void printRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int line, int column, String sign) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign + "\t");
            }
            System.out.println();
        }
    }
}
