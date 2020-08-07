package atguigu.inter;

/**
 * @author Symon
 * @version 1.0
 * @className Teacher
 * @description TODO
 * @date 2020/8/3 16:08
 */
public class Teacher implements Person {
    @Override
    public void sayHello() {
        System.out.println("上课");
    }
}
