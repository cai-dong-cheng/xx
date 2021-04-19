package com.javabase.example.sixday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05Exception {
      public static void main(String[] args) /*throws ParseException*/ {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("1999-1222");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");
    }
}
