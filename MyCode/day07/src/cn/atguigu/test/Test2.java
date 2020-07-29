package cn.atguigu.test;

/**
 * @author Symon
 */
public class Test2 {
    public static void main(String[] args) {
        Person o = new Person();
        o.age = 9;
        o.name = "tom";
        a(o);
        a(o.name);
        System.out.println(o.age);
    }

    public static void a(Person person) {
        person.age += 1;
    }
    public static void a(String name) {
        name += "p";
    }
}