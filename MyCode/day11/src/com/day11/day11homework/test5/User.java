package com.day11.day11homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className User
 * @description TODO
 * @date 2020/8/5 19:08
 */
@Table("t_user")
public class User {
    @Column(name = "no", type = "int")
    private int id;
    @Column(name = "username", type = "varchar(20)")
    private String userName;
    @Column(name = "pwd", type = "char(6)")
    private String passWord;
    @Column(name = "email", type = "varchar(50)")
    private String email;

}
