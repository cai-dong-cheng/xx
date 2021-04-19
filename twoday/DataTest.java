package com.javabase.example.twoday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入你的出生日期，格式为：yyyy-MM-dd");
        String src = sc.next() ;
        SimpleDateFormat birthdayDate = new SimpleDateFormat("yyyy-MM-dd") ;
        Date birthday = birthdayDate.parse(src) ;
        long birthdayDateTime = birthday.getTime() ;
        long todayTime = new Date().getTime() ;
        long time = todayTime - birthdayDateTime ;
        System.out.println(time/1000/60/60/24);
    }
}
