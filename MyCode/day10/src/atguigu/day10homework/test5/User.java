package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className User
 * @description TODO
 * @date 2020/8/4 23:27
 */
public class User {
    private String userType;
    private int userId;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return userId + "-" + userType;
    }
}
