package com.atguigu.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Symon
 * @version 1.0
 * @className ListDemo
 * @description TODO
 * @date 2020/8/12 10:25
 */
public class ListDemo {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.addFirst("first");
        llist.add("mid");
        llist.addLast("last");


        llist.removeLast();


        System.out.println(llist);
        List list = new ArrayList();
        list.add("qwer");
        list.add("asdf");
        list.add("zxcv");
        list.add("uiop");

        list.add(1, "zxcv");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.set(2, "m");
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
    }
}
