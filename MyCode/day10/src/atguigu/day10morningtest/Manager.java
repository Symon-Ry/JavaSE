package atguigu.day10morningtest;

/**
 * @author Symon
 * @version 1.0
 * @className Manager
 * @description TODO
 * @date 2020/8/3 8:41
 */
public class Manager {
    public void toClass(Teacher teacher) {
        teacher.inClass();
        if (teacher instanceof EnglishTeacher) {
            ((EnglishTeacher) teacher).listen();
        }
    }
}
