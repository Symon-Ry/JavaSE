package com.day11.myenum1;

// 在jdk1.5之后可以使用enum关键字来声明枚举
// enum关键字声明的枚举类自动继承自Enum
public enum Season {


    // 枚举关键字声明枚举类必须在第一部分写本类的公开属性
    // 如果属性使用无参构造方法，可以将new对象的内容全部删掉。如果需要调用有参构造方法，只需要加小括号
    SPRING("春","春暖花开"),
    SUMMER("夏","夏日炎炎"),
    AUTUMN("秋","秋高气爽"),
    WRITER("冬","白雪皑皑");

    private String seasonName;
    private String seasonInfo;

    private Season(String seasonName,String seasonInfo){
        this.seasonName = seasonName;
        this.seasonInfo = seasonInfo;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonInfo='" + seasonInfo + '\'' +
                '}';
    }
}
