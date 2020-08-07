package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className Test
 * @description TODO
 * @date 2020/8/4 23:35
 */
public class Test {
    public static void main(String[] args) {
        User[] users = new User[15];

        Receptionist v1 = new Receptionist(new V1Filter());
        Receptionist v2 = new Receptionist(new V2Filter());
        Receptionist a = new Receptionist(new AFilter());

        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].setUserId(i + 1);
            if (i < 5) {
                v1.getFilter().filter(users[i]);
            } else if (i < 10) {
                v2.getFilter().filter(users[i]);
            } else {
                a.getFilter().filter(users[i]);
            }
        }
        for (User u : users) {
            System.out.println(u);
        }
    }
}
