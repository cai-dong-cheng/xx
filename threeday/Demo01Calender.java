package com.javabase.example.threeday;


import java.util.Calendar;
import java.util.Date;

public class Demo01Calender {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,1999);
        c.add(Calendar.MONTH,9);
        Date time = c.getTime();
        System.out.println(time);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int data = c.get(Calendar.DAY_OF_MONTH);//DATA也是一样的
        System.out.println(data);

    }
}
