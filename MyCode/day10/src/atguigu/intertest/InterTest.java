package atguigu.intertest;


/**
 * @author Symon
 * @version 1.0
 * @className InterTest
 * @description TODO
 * @date 2020/8/3 16:20
 */
public class InterTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        System.out.println(computer.add(12, 23));
        System.out.println(computer.sub(12, 23));
        System.out.println(computer.mul(12, 23));
        System.out.println(computer.mod(12, 23));
        computer.goNet();
    }
}
