package com.atguigu.school;

/**
 * @author Symon
 * @version 1.0
 * @className Master
 * @description TODO
 * @date 2020/8/1 15:30
 */
public class Master {

    public void sendTeacher(Teacher teacher) {
        if (teacher instanceof LangTeacher) {
            LangTeacher lt = (LangTeacher) teacher;
            lt.langSong();
            lt.shangKe();
        } else if (teacher instanceof EnglishTeacher) {
            EnglishTeacher et = (EnglishTeacher) teacher;
            et.beiSong();
            et.shangKe();
        } else {
            teacher.shangKe();
        }
    }
}
