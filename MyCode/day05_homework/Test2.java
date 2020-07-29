package cn.atguigu.day05homework;

/**
 * @author Symon
 */
public class Test2 {
    public static void main(String[] args) {
        String[] strArr = {"黑桃", "红桃", "梅花", "方片"};
        String[] strArr1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[][] lastArr = new String[4][13];
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr1.length; j++) {
                lastArr[i][j] = strArr[i] + strArr1[j];
                System.out.print(lastArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
