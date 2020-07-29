package cn.atguigu.test;

/**
 * @author Symon
 */
public class HuiJiChang {
    private char[][] changDiArr;
    public HuiJiChang(char[][] changDiArr) {
        this.changDiArr = changDiArr;
    }
    public void updateHuiJI(HuiJi huiJi) {
        changDiArr[huiJi.x][huiJi.y] = ' ';
        changDiArr[huiJi.iniIndex1][huiJi.iniIndex2] = huiJi.huiJiStructure;
    }

    public void show() {
        for (int i = 0; i < changDiArr.length; i++) {
            for (int j = 0; j <changDiArr[i].length; j++) {
                System.out.print(changDiArr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
