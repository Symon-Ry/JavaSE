package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className V2Filter
 * @description TODO
 * @date 2020/8/4 23:32
 */
public class V2Filter implements Filter {
    @Override
    public void filter(User u) {
        u.setUserType("v2");
    }
}
