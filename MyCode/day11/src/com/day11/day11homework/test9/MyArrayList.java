package com.day11.day11homework.test9;

/**
 * @author Symon
 * @version 1.0
 * @className MyArrayList
 * @description TODO
 * @date 2020/8/5 20:06
 */
public class MyArrayList implements Touchable{
    private Object[] all = new Object[2];
    private int total = 0;

    public void add(Object element) {
        if (total >= all.length) {
            Object[] objects = new Object[total * 2];
            for (int i = 0; i < all.length; i++) {
                objects[i] = all[i];
            }
            all = objects;
        }
        all[total++] = element;
    }


    public void remove(int index) {
        if (index < 0 || index > total) {
            System.out.println("没有这个元素");
        } else {
            all[index] = null;
        }
    }

    //测试
    public Object[] getAll() {
        return all;
    }


    public void set(int index, Object value) {
        if (index < 0 || index > total) {
            System.out.println("没有这个元素");
        } else {
            all[index] = value;
        }
    }

    public Object get(int index) {
        if (index < 0 || index > total) {
            System.out.println("没有这个元素");
            return null;
        } else {
            return all[index];
        }
    }

    public Selector select() {

        return new MySelector();
    }


    class MySelector implements Selector{

        int cursor;

        @Override
        public boolean hasNext() {
            return cursor !=total;
        }
        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}
