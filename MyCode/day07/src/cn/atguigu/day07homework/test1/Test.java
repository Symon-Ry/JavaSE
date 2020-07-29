package cn.atguigu.day07homework.test1;

/**
 * @author Symon
 */
public class Test {
    public static void main(String[] args) {
        Count count = new Count();
        System.out.println("count.sum(12, 12, 23, 34) = " + count.sum(12, 12, 23, 34));

        System.out.println("count.max(12, 12, 23, 34) = " + count.max(12, 12, 23, 34));

        System.out.println("count.concat(\"qwer\",\"wert\",\"erty\",\"rtyu\",\"tyui\",\"yuio\",\"uiop\") = " + count.concat("qwer", "wert", "erty", "rtyu", "tyui", "yuio", "uiop"));

        System.out.println("count.isEven(12,4,2,6,8,9) = " + count.isEven(12, 4, 2, 6, 8, 4));

    }
}
