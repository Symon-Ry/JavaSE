package cn.atguigu.day07homework;

/**
 * @author Symon
 * 描述：猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，
 * <p>
 * 又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。以后每天都吃
 * <p>
 * 了前一天剩下的一半多一个。到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
 * <p>
 * f(n+1)=f(n)/2-1
 */
public class Test7 {
    public static int f(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (f(day+1) + 1) * 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(f(8));
    }
}
