package com.atguigu.collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 14:21
 */
public class Test1 {
    public static void main(String[] args) {
        String str = new String("abc");
        System.out.println(str.equals("abc"));
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }

        Collection list = new ArrayList();
        list.add("qwe");
        list.add("asd");
        list.add(new Object());
        list.add(123);
        list.add(true);
        System.out.println(list);

        Collection coll = new ArrayList();
        coll.add("tom");
        coll.add("zc");
        coll.add('d');
        coll.add("zc");
        System.out.println(coll);

        list.addAll(coll);
        System.out.println(list);
        System.out.println(list.containsAll(coll));

        System.out.println(coll.size());

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

    }
}
