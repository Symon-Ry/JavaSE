package com.atguigu.homework.test1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 18:22
 */
public class Test {
    public static void main(String[] args) {
        String[] nums = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"黑桃", "红桃", "梅花", "方块"};
        String[] kings = {"大王", "小王"};
        ArrayList list = new ArrayList();

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                list.add(types[i] + nums[j]);
            }
        }
        list.add(kings[0]);
        list.add(kings[1]);

        for (Object o : list) {
            String s = (String) o;
            System.out.print(s + "\t");
            if (s.contains("K")) {
                System.out.println();
            }
        }

        Random random = new Random();
        ArrayList p1 = new ArrayList();
        ArrayList p2 = new ArrayList();
        ArrayList p3 = new ArrayList();
        ArrayList p4 = new ArrayList();

        for (int i = 0; i < 11; i++) {
            p1.add(list.remove(random.nextInt(list.size())));
        }

        for (int i = 0; i < 11; i++) {
            p2.add(list.remove(random.nextInt(list.size())));
        }

        for (int i = 0; i < 11; i++) {
            p3.add(list.remove(random.nextInt(list.size())));
        }

        for (int i = 0; i < 11; i++) {
            p4.add(list.remove(random.nextInt(list.size())));
        }

        System.out.println();
        System.out.print("第一人：");
        for (Object o : p1) {
            System.out.print((String) o + "\t");
        }

        System.out.println();
        System.out.print("第二人：");
        for (Object o : p2) {
            System.out.print((String) o + "\t");
        }

        System.out.println();
        System.out.print("第三人：");
        for (Object o : p3) {
            System.out.print((String) o + "\t");
        }

        System.out.println();
        System.out.print("第四人：");
        for (Object o : p4) {
            System.out.print((String) o + "\t");
        }

        System.out.println();
        System.out.print("剩余：");
        for (Object o : list) {
            System.out.print((String) o + "\t");
        }
    }
}
