package atguigu.day10morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className Teacher
 * @description TODO
 * @date 2020/8/3 8:37
 */
public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void inClass() {
        System.out.println("老师在讲课");
    }
}
