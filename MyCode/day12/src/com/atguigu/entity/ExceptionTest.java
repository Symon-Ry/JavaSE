package com.atguigu.entity;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Symon
 * @version 1.0
 * @className ExceptionTest
 * @description TODO
 * @date 2020/8/5 15:28
 */
public class ExceptionTest {

    public static void main(String[] args) {
        new ExceptionTest().test1();
    }

    @Test
    public void test1() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("请输入被除数：");
            int i = input.nextInt();
            System.out.println("请输入除数：");
            int j = input.nextInt();
            int result = i / j;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (InputMismatchException e) {
            System.out.println("请输入正确的数字");
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
