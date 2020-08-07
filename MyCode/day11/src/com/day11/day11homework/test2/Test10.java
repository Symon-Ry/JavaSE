package com.day11.day11homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className Test10
 * @description TODO
 * @date 2020/8/5 18:48
 */
public class Test10 {
    public static void main(String[] args) {
        Out.In in = new Out().new In();
        in.print();
    }
}
class Out {
    private int age = 12;
    class In {
        private int age = 13;
        public void print() {
            int age = 14;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Out.this.age);
        }
    }
}
