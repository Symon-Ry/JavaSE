package cn.atguigu.day07homework.test4;

/**
 * @author Symon
 */
public class Test {
    public static void main(String[] args) {
        PassParamDemo passParamDemo = new PassParamDemo();

        int a=2;
        passParamDemo.doubleNumber(a);
        System.out.println(a);

        char c = 'e';
        passParamDemo.toUpperCase(c);
        System.out.println(c);

        Circle circle = new Circle();
        circle.radius = 10;
        passParamDemo.expandCircle(circle, 2);
        System.out.println(circle.radius);

        int[] arr = new  int[]{4, 5, 3, 1, 0, 89};
        passParamDemo.sort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
