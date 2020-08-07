package atguigu.day10homework.test1;

public abstract interface A {
    public static final int abc = 10;
    void showA();

    default void showB() {
        System.out.println("BBBB");
    }
}
