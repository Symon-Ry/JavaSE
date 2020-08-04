package com.atguigu.zoo;

// A extends B 叫做A继承B，B被称为父类(基类)，A被称作子类，A继承自B
// 子类可以继承父类所有属性和方法，构造方法不能继承。
// 子类也可以拥有自己的属性和方法，创建对象之后，这些属性和方法都可以正常使用。
public class Dog extends Pet{

    public String name;
    private String gender;

    public Dog(){
        // 调用父类无参的构造方法。java语法规定，子类必须在自己构造方法的第一行调用父类的构造方法。
        // 如果父类有多个构造方法，那么调用哪个都行。
        // super();// 在没有显示写出任何一句调用父类构造方法的时候，将默认隐示调用父类无参的构造方法。
        super("小白",5,"秋田犬");
        // System.out.println("hello");

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void work(){
        System.out.println("工作");
    }

    public void sayHello(){
        System.out.println(name);
        System.out.println(this.getName());
        // 调用的是谁的方法，访问的就是谁属性，方法访问属性就近原则。
        // 当调用一个方法的时候，方法需要访问属性，会先从本类开始搜索属性，找到后访问。
        // 如果方法访问的时候找不到对应的属性，会向父类中搜索对应属性。
        System.out.println(super.getName());
    }

    // 方法重写需要在父子类中，子类编写一个和父类一模一样的方法(方法名和参数组完全一致)
    // 方法重写是一个方法，子类重写了父类的方法，那么以后再调用的都是子类的方法。
    @Override // 注解，规定下列方法必须执行方法重写的语法
    public void play(){
        super.play();// 必须在子类的方法中使用super关键字调用已经被重写的父类的方法。
        System.out.println("玩丢飞盘！");
    }
}
