package com.atguigu.school;

/**
 * @author Symon
 * @version 1.0
 * @className EnglishTeacher
 * @description TODO
 * @date 2020/8/1 16:30
 */
public class EnglishTeacher extends Teacher{
    @Override
    public void shangKe() {
        System.out.println("上英语课");
    }

    public void beiSong() {
        System.out.println("背英语课文");
    }
}
