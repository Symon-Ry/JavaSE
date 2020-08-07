package atguigu.day10homework.test2;

/**
 * @author Symon
 * @version 1.0
 * @className Sun
 * @description TODO
 * @date 2020/8/4 22:53
 */
public class Sun extends Star implements Universe{

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }
}
