package com.atguigu.day15homework.test9;

import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/11 19:20
 */
public class Test {
    public static void main(String[] args) {
        User[] users = {new User("jack", "1234"), new User("rose", "5678"), new User("tom", "0000")};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = input.next();
        System.out.println("请输入密码");
        String pd = input.next();

        boolean flag = false;
        for (User user : users) {
            if (user.getUserName().equals(name)&&user.getPassWord().equals(pd)) {
                flag = true;
            }
        }

        System.out.println(flag ? "登录结果：成功" : "登录结果：用户名或密码错误");



    }
}
