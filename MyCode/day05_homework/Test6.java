package cn.atguigu.day05homework;

/**
 * @author Symon
 */
public class Test6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 2, 1};
        int[] b = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    flag = false;
                    break;
                }
            }
        }else{
            flag = false;
        }
        System.out.println("是否一致？" + flag);
    }
}
