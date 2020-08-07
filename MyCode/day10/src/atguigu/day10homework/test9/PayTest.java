package atguigu.day10homework.test9;

/**
 * @author Symon
 * @version 1.0
 * @className PayTest
 * @description TODO
 * @date 2020/8/5 18:33
 */
public class PayTest {
    public static void main(String[] args) {
        Payment[] payments = Payment.values();
        for (Payment payment : payments) {
            payment.pay();
        }
    }
}
