package com.javabase.example.threeday;

public class Demo03Integer {
    public static void main(String[] args) {
        int li =100 ;
        String s1 = li+"" ;
        System.out.println(s1+200);
        String s2 = Integer.toString(li);
        System.out.println(s2+200);
        String s3 = String.valueOf(li);
        System.out.println(s3+200);
        int i = Integer.parseInt(s3);
        System.out.println(i+200);
    }
}
