package com.atguigu.morningtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/12 8:34
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("asd");
        coll.add("asda");
        coll.add("asdaa");
        coll.add("asdaaa");
        coll.add("asdaaa");
        String str = new String("aaa");
        String intern = str.intern();


        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.next());
        }
    }
}
