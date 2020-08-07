package com.day11.myenum1;

// Enum类中常见的方法
public class EnumTest {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        String s = season.toString();// 返回当前枚举类的属性name，这个name就是当前这个枚举值得属性名。
        System.out.println(s);
        String s1 = season.name();// 返回当前枚举值的name属性，和Enum类重写的toString()方法返回同样的结果。
        System.out.println(s1);
        int index = season.ordinal();// 该方法返回当前枚举值在枚举类中的索引。这个索引从0开始。
        System.out.println(index);
        Season[] seas = Season.values();// 静态方法values用于返回当前枚举类中所有的枚举值得数组。
        for (Season sea : seas) {
            System.out.println("====================================");
            System.out.println(sea);
            Season s2 = Season.valueOf(sea.name());
            System.out.println(s2);
            System.out.println("====================================");
        }
        System.out.println("---------------------------------");
        // valueOf()方法用于根据参数字符串，生成对应字符串的枚举对象。
        // 这个String值必须是当前枚举类中包含的枚举值的name，如果写的不对则会抛出异常。
        Season s2 = Season.valueOf("SUMMER");
        System.out.println(s2);
    }
}
