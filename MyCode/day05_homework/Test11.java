package cn.atguigu.day05homework;

import java.util.Scanner;

/**
 * @author Symon
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a English word:");
        String word = input.next();
        char[] chars = word.toCharArray();
        boolean flag = false;
        for (char aChar : chars) {
            if (aChar == 'a') {
                flag = true;
            }
        }
        System.out.println("Is the word contains 'a'?" + flag);
    }
}
