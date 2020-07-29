package cn.atguigu.test;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test1 {
    public static void main(String[] args) {
        char[][] huiJiChang=new char[10][10];
        for (int i = 0; i < huiJiChang.length; i++) {
            for (int j = 0; j < huiJiChang[i].length; j++) {
                huiJiChang[i][j] = ' ';
            }
        }
        HuiJiChang chang = new HuiJiChang(huiJiChang);
        HuiJi huiJi = new HuiJi('6', 1, 1);
        Scanner in = new Scanner(System.in);
        while (true) {
            String key = in.next();
            switch (key) {
                case "w":
                    huiJi.up();
                    break;
                case "s":
                    huiJi.down();
                    break;
                case "a":
                    huiJi.left();
                    break;
                case "d":
                    huiJi.right();
                    break;
                default:
                    break;
            }
            chang.updateHuiJI(huiJi);
            chang.show();
        }
        //ControlWindowsConsole.console("/k","cls");
    }
}
