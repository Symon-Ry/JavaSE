package com.day11.myenum;

// 自定义枚举类四季
public class Season {

    public static final Season SPRING = new Season("春","春暖花开");
    public static final Season SUMMER = new Season("夏","夏日炎炎");
    public static final Season AUTUMN = new Season("秋","秋高气爽");
    public static final Season WINTER = new Season("冬","白雪皑皑");

    private String seasonName;// 季节的名字
    private String seasonInfo;// 季节的描述信息

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
