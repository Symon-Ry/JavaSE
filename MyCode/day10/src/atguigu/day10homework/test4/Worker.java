package atguigu.day10homework.test4;

/**
 * @author Symon
 * @version 1.0
 * @className Worker
 * @description TODO
 * @date 2020/8/4 23:15
 */
public class Worker {
    public void pickApple(CompareAble c, Apple a1, Apple a2) {
        if (c instanceof CompareBig) {
            CompareBig big = (CompareBig) c;
            System.out.println("默认挑大的：");
            big.compare(a1, a2);
        }
        if (c instanceof CompareColor) {
            System.out.println("挑小的：");
            CompareColor red = (CompareColor) c;
            red.compareColor(a1, a2);
        }
    }
}
