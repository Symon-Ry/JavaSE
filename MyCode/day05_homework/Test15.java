package cn.atguigu.day05homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入有几组：");
        int nums = input.nextInt();
        int grades[][] = new int[nums][];
        for (int i = 0; i < nums; i++) {
            System.out.println("请输入第" + (i + 1) + "组有多少人");
            grades[i] = new int[input.nextInt()];
        }
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "组第" + (j + 1) + "个学生的成绩:");
                grades[i][j] = input.nextInt();
            }
        }
        int maxGrade = grades[0][0], minGrade = grades[0][0], avg = 0, sumGrade = 0, sum = 0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++,sum++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                }
                if (grades[i][j] < minGrade){
                    minGrade = grades[i][j];
                }
                sumGrade += grades[i][j];
            }
        }
        avg = sumGrade / sum;
        System.out.println("maxGrade = " + maxGrade);
        System.out.println("minGrade = " + minGrade);
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);
    }
}
