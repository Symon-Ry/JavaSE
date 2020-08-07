package atguigu.intertest;

/**
 * @author Symon
 * @version 1.0
 * @className Computer
 * @description TODO
 * @date 2020/8/3 16:19
 */
public class Computer implements Calc ,GoNet{
    @Override
    public double add(double num1, double num2) {
        System.out.print(num1 + "+" + num2 + "=");
        return num1 + num2;
    }

    @Override
    public double sub(double num1, double num2) {
        System.out.print(num1 + "-" + num2 + "=");
        return num1 - num2;
    }

    @Override
    public double mul(double num1, double num2) {
        System.out.print(num1 + "*" + num2 + "=");
        return num1 * num2;
    }

    @Override
    public double mod(double num1, double num2) {
        System.out.print(num1 + "/" + num2 + "=");
        return num1 / num2;
    }

    @Override
    public void goNet() {
        System.out.println("上网中，IP为："+IP);
    }
}
