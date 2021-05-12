package com.javabase.example.demo01.File;

public class Demo01Recurison {
    public static void main(String[] args) {
        int s =sum(3);
        System.out.println(s);
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
