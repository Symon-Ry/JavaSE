package atguigu.day10homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className CompareColor
 * @description TODO
 * @date 2020/8/4 23:13
 */
public class CompareColor implements CompareAble {
    public void compareColor(Apple... apples) {
        for (Apple a : apples) {
            if ("红色".equals(a.getColor()) || "red".equals(a.getColor())) {
                System.out.println(a);
            }
        }
    }
}
