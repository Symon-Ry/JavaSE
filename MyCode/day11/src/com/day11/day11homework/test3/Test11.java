package com.day11.day11homework.test3;

/**
 * @author Symon
 * @version 1.0
 * @className Test11
 * @description TODO
 * @date 2020/8/5 18:54
 */
public class Test11 {
    public static void main(String[] args) {
        Out out = new Out();
        out.Print(3);
    }
}
class Out {
    private int age = 12;
    public void Print(final int x) {
        class In {
            public void inPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }
        new In().inPrint();
    }
}
