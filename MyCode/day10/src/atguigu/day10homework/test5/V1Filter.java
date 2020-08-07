package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className V1Filter
 * @description TODO
 * @date 2020/8/4 23:29
 */
public class V1Filter implements Filter {

    @Override
    public void filter(User u) {
        u.setUserType("v1");
    }
}
