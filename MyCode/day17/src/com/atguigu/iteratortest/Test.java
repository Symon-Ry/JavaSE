package com.atguigu.iteratortest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 11:12
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println((int) iterator.next());
        }

        for (Object o : list) {
            System.out.println((int) o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
