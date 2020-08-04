package com.atguigu.zoo;

// 宠物类
public class Pet {
    private String name;
    private int age;
    private String type;

    // 当一个类有带参构造方法后，一定要给出一个无参构造方法。方便这类被继承。
    public Pet(){

    }

    public Pet(String name,int age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected void play(){
        System.out.println("和主人玩耍");
    }
}
