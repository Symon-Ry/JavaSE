package com.day11.day11homework.test8;

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

    static class V1Filter implements Filter {

        @Override
        public void filter(User u) {
            u.setUserType("v1");
        }
    }

    static class V2Filter implements Filter {
        @Override
        public void filter(User u) {
            u.setUserType("v2");
        }
    }

    static class AFilter implements Filter {
        @Override
        public void filter(User u) {
            u.setUserType("A");
        }
    }
}
