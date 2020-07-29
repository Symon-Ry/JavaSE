package cn.atguigu.day06homework.test3;

import cn.atguigu.day06homework.test2.MyDate;

/**
 * @author Symon
 */
public class Test03 {
    public static void main(String[] args) {
        Citizen me = new Citizen();
        MyDate bir = new MyDate();
        bir.year = 1998;
        bir.month = 3;
        bir.day = 9;
        me.name = "赖新明";
        me.bir = bir;
        me.id = "1982374198237641289678675";
        System.out.println(me);
    }
}
