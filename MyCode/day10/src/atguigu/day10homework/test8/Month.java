package atguigu.day10homework.test8;

public enum Month {
    JANUARY(1, "一月"),
    FEBRUARY(2, "二月"),
    MARCH(3, "三月"),
    APRIL(4, "四月"),
    MAY(5, "五月"),
    JUNE(6, "六月"),
    JULY(7, "七月"),
    AUGUST(8, "八月"),
    SEPTEMBER(9, "九月"),
    OCTOBER(10, "十月"),
    NOVEMBER(11, "十一月"),
    DECEMBER(12, "十二月");

    private int value;
    private String description;

    Month(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + "->" +name() + "->" + description ;
    }
}
