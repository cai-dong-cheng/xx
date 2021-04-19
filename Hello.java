package com.javabase.example;

/*
注意点
类名首字母大写
只能有一个类是是public类
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("这是一个简单的小程序");
        Student student = new Student();
        student.speak("we are student");
    }
}

class Student {
    public void speak(String s){
        System.out.println(s);
    }
}