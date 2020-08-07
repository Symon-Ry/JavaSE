package com.atguigu.school;

/**
 * @author Symon
 * @version 1.0
 * @className LangTeacher
 * @description TODO
 * @date 2020/8/1 15:29
 */
public class LangTeacher extends Teacher {
    @Override
    public void shangKe() {
        System.out.println("语文老师在上课");
    }

    public void langSong() {
        System.out.println("朗诵课文");
    }
}
