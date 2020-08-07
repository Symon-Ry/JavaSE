package atguigu.day10morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className EnglishTeacher
 * @description TODO
 * @date 2020/8/3 8:39
 */
public class EnglishTeacher extends Teacher {
    public EnglishTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void inClass() {
        System.out.println("上英语课");
    }

    public void listen() {
        System.out.println("上听力课");
    }
}
