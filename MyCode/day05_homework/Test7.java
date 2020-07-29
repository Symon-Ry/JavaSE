package cn.atguigu.day05homework;

/**
 * @author Symon
 */
public class Test7 {
    public static void main(String[] args) {
        char[] truly = {'A', 'D', 'B', 'C', 'D'};

        char[] shang = {'D', 'C', 'B', 'A', 'D'};
        char[] gui = {'A', 'D', 'B', 'C', 'D'};
        char[] gu = {'A', 'D', 'B', 'C', 'A'};
        char[] hao = {'A', 'B', 'C', 'D', 'D'};

        int sGrade=0,guiGrade=0,guGrade=0,haoGrade=0;
        for (int i = 0; i < shang.length; i++) {
            if (shang[i] == truly[i]) {
                sGrade += 2;
            }
            if (gui[i] == truly[i]) {
                guiGrade+=2;
            }

            if (gu[i] == truly[i]) {
                guGrade+=2;
            }
            if (hao[i] == truly[i]) {
                haoGrade+=2;
            }
        }
        System.out.println("满分10分，小尚：得分：" + sGrade + "分");
        System.out.println("满分10分，小硅：得分：" + guiGrade + "分");
        System.out.println("满分10分，小谷：得分：" + guGrade + "分");
        System.out.println("满分10分，小好：得分：" + haoGrade + "分");
    }
}
