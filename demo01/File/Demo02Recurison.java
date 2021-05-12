package com.javabase.example.demo01.File;

public class Demo02Recurison {
    public static void main(String[] args) {
        int j = jc(5);
        System.out.println(j);

    }
    public static int jc(int n){
        if (n==1){
            return 1;
        }
        return n*jc(n-1);
    }
}
