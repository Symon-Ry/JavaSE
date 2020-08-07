package atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className Student
 * @description TODO
 * @date 2020/8/3 10:17
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (this == obj) {
            flag = true;
        } else if(obj instanceof Student) {
            Student stu = (Student) obj;
            if (getName().equals(stu.getName()) && getAge() == stu.getAge()) {
                flag = true;
            }
        }
        return flag;
    }
}
