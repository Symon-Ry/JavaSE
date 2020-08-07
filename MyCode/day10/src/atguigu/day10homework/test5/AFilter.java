package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className AFilter
 * @description TODO
 * @date 2020/8/4 23:32
 */
public class AFilter implements Filter {
    @Override
    public void filter(User u) {
        u.setUserType("A");
    }
}
