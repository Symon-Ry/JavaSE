package com.atguigu.zoo;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.setName("小白");
//        dog.setAge(5);
//        dog.setType("秋田犬");
//        dog.setGender("公的");
//        System.out.println(dog.getName());
//        dog.play();
//        dog.work();
        // dog.setName("小白");
        dog.name = "旺财";
        // dog.sayHello();
        dog.play();// 如果子类重写过父类的方法，那么子类对象调用出来的一定是子类的方法。
        Cat cat = new Cat();
        cat.play();


    }
}
