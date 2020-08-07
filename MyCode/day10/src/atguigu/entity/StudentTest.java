package atguigu.entity;

/**
 * @author Symon
 * @version 1.0
 * @className StudentTest
 * @description TODO
 * @date 2020/8/3 10:18
 */
public class StudentTest {
    public static void main(String[] args) {
        /*Student[] stus = new Student[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < stus.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学员的名字：");
            String name = input.next();
            System.out.println("请输入第" + (i + 1) + "个学员的年龄：");
            int age = input.nextInt();
            stus[i] = new Student(name, age);
        }

        for (Student stu : stus) {
            System.out.println(stu.getName() + "\t" + stu.getAge());
        }*/

        Student tom = new Student("Tom", 21);
        Student jerry = new Student("Jerry", 22);
        Student stu = new Student("Tom", 21);
        stu = tom;

        if (tom.equals(stu)) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }

    }
}
