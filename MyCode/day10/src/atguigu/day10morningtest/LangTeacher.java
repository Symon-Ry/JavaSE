package atguigu.day10morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className LangTeacher
 * @description TODO
 * @date 2020/8/3 8:39
 */
public class LangTeacher extends Teacher {
    public LangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void inClass() {
        System.out.println("上语文课");
    }
}
