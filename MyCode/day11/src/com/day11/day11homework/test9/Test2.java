package com.day11.day11homework.test9;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Symon
 * @version 1.0
 * @className Test2
 * @description TODO
 * @date 2020/8/5 20:42
 */
public class Test2 {
    //（1）声明静态的MyArrayList类型的list类变量
    public static MyArrayList list;

    /*声明public static void init()方法，
            ①在方法中创建MyArrayList类型对象，
            ②并调用list的add()方法，添加3个对象，
            ③并在init()方法上标记JUnit4的@BeforeClass注解*/
    @BeforeClass
    public static void init() {
        list = new MyArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
    }

    /*声明public void before()方法，

​	①打印“该测试方法开始前list中的数据如下："

​	②调用list的select方法，获取Selector的对象，并调用hasNext()和next()遍历容器中所有的对象

​	③并在before()方法上标记JUnit4的@Before的注解*/
    @Before
    public void before() {
        System.out.println("该测试方法开始前list中的数据如下：");
        Selector select = list.select();
        while (select.hasNext()) {
            System.out.println(select.next());
        }
    }

    /*声明public void after()方法，

​	①打印“该测试方法结束后list中的数据如下："

​	②调用list的select方法，获取Selector的对象，并调用hasNext()和next()遍历容器中所有的对象

​	③并在after()方法上标记JUnit4的@After的注解*/
    @After
    public void after() {
        System.out.println("该测试方法结束后list中的数据如下：");
        Selector select = list.select();
        while (select.hasNext()) {
            System.out.println(select.next());
        }
    }

    /*声明public void testAdd()方法，

​	①在方法中，打印“现在测试的是testAdd()方法"

​	②在方法中，再次调用list的add()方法往list容器对象中添加1个对象

​	③并在testAdd()方法上标记JUnit4的@Test的注解*/
    @Test
    public void testAdd() {
        System.out.println("现在测试的是testAdd()方法");
        list.add("r");
    }

    /*声明public void testRemove()方法，

​	①在方法中，打印“现在测试的是testRemove()方法"

​	②调用list的remove方法，删除[1]的对象

​	③并在testRemove()方法上标记JUnit4的@Test的注解*/
    @Test
    public void testRemove() {
        System.out.println("现在测试的是testRemove()方法");
        list.remove(1);
    }

    /*声明public void testSet()方法

​	①在方法中，打印“现在测试的是testSet()方法"

​	②调用list的set方法，替换[1]的对象

​	③并在testSet()方法上标记JUnit4的@Test的注解*/
    @Test
    public void testSet() {
        System.out.println("现在测试的是testSet()方法");
        list.set(1, "f");
    }


    /*声明public void testGet()方法

​	①在方法中，打印“现在测试的是testGet()方法"

​	②调用list的get方法，获取[1]的对象，并打印

​	③并在testGet()方法上标记JUni*/
    @Test
    public void testGet() {
        System.out.println("现在测试的是testGet()方法");
        System.out.println(list.get(1));
    }


}
