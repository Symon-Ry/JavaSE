package cn.atguigu.day05homework;

/**
 * @author Symon
 */
public class Test14 {
    public static void main(String[] args) {
        String[][] strings = new String[4][13];
        String[] strs = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String[13];
            for (int j = 0; j < strings[i].length; j++) {
                if (i == 0) {
                    strings[i][j] = "黑桃";
                }
                if (i == 1) {
                    strings[i][j] = "红桃";
                }
                if (i == 2) {
                    strings[i][j] = "梅花";
                }
                if (i == 3) {
                    strings[i][j] = "方块";
                }
                strings[i][j] += strs[j];
            }
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
