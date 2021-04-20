package com.javabase.example.severday;

import java.util.Scanner;

public class Demo01RegisterException {
    static String[] usernames = {"张三","赵四","王五"};

    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入你要注册的用户名");
        String username = sc.next();
        checkname(username);

    }
    public static void checkname(String username) throws RegisterException {
        for (String name : usernames) {
            if (name.equals(username)){
//                throw new RegisterException("用户名已经被注册");

            }
        }
        System.out.println("注册成功");
    }
}
