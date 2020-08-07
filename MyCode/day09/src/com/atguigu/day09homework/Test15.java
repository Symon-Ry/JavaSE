package com.atguigu.day09homework;

/**
 * @author Symon
 * @version 1.0
 * @className Test15
 * @description TODO
 * @date 2020/8/4 21:25
 */
public class Test15 {

    public static void meeting(Person15...  ps) {
        for (Person15 p : ps) {
            if (p instanceof Man15) {
                Man15 man=(Man15)p;
                man.eat();
                man.toilet();
                man.smoke();
                System.out.println("-------------");
            } else if (p instanceof Woman15) {
                Woman15 man = (Woman15) p;
                man.eat();
                man.toilet();
                man.makeUp();
                System.out.println("-------------");
            } else {
                p.eat();
                p.toilet();
                System.out.println("-------------");
            }
        }
    }

    public static void main(String[] args) {
        Man15 man1 = new Man15();
        Man15 man2 = new Man15();
        Man15 man3 = new Man15();

        Woman15 wo = new Woman15();
        Woman15 wo1 = new Woman15();
        Woman15 wo2 = new Woman15();

        meeting(man1, man2, man3, wo, wo1, wo2);
    }
}

class Person15 {
    public void eat() {
        System.out.println("人在吃饭");
    }

    public void toilet() {
        System.out.println("上洗手间");
    }
}

class Man15 extends Person15{
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("站着");
    }

    public void smoke() {
        System.out.println("抽烟");
    }
}

class Woman15 extends Person15 {
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("坐着");
    }

    public void makeUp() {
        System.out.println("化妆");
    }
}
