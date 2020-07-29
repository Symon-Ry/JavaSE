package cn.atguigu.test;

/**
 * @author Symon
 */
public class HuiJi {
    public char huiJiStructure;
    private HuiJiChang huiJiChang;
    public int iniIndex1, iniIndex2;
    public int x, y;

    public HuiJi(char huiJiStructure, int iniIndex1, int iniIndex2) {
        this.huiJiStructure = huiJiStructure;
        this.iniIndex1 = iniIndex1;
        this.iniIndex2 = iniIndex2;
        x = iniIndex1;
        y = iniIndex2;
    }

    public void up() {
        x = iniIndex1;
        y = iniIndex2;
        this.iniIndex2 += 1;
    }

    public void down() {
        x = iniIndex1;
        y = iniIndex2;
        this.iniIndex2 -= 1;
    }

    public void left() {
        x = iniIndex1;
        y = iniIndex2;
        this.iniIndex1 -= 1;
    }

    public void right() {
        x = iniIndex1;
        y = iniIndex2;
        this.iniIndex1 += 1;
    }
}
