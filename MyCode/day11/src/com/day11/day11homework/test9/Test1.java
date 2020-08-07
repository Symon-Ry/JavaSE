package com.day11.day11homework.test9;

import com.sun.media.sound.SoftTuning;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/5 20:18
 */
public class Test1 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add("q");
        list.add("w");
        list.add("e");

        list.remove(1);
        list.set(1, "s");
        Object o1 = list.get(1);

        Selector select = list.select();
        while (select.hasNext()) {
            System.out.println(select.next());
        }
    }
}
