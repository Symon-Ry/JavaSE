package atguigu.day10homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/4 22:54
 */
public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();

        Universe u = new Sun();
        u.doAnything();

        Star s = new Sun();
        s.shine();
    }
}
