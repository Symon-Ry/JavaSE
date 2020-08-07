package com.atguigu.school;

/**
 * @author Symon
 * @version 1.0
 * @className TeacherTest
 * @description TODO
 * @date 2020/8/1 15:31
 */
public class TeacherTest {
    public static void main(String[] args) {
        Master master = new Master();
        Teacher lt = new LangTeacher();
        Teacher mt = new MathTeacher();
        Teacher et = new EnglishTeacher();

        master.sendTeacher(lt);
        System.out.println("----------------");
        master.sendTeacher(et);
        System.out.println("----------------");
        master.sendTeacher(mt);

    }
}
