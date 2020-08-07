package atguigu.day10homework.test3;

public interface FightAble {
    void specialFight();

    default void comminFight() {
        System.out.println("普通打击");
    }
}
