package com.javabase.example.oneday;
/*
char型数组使用 System.out.println（）输出的是数组的所有元素的值，不是地址值。
 */

public class Example2_4 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4} ;
        int b [] = {100,200,300} ;
        char c[] = {'1','2','啊'};
        System.out.println("输出数组a的元素个数="+a.length);
        System.out.println("输出数组b的元素个数="+b.length);
        System.out.println("输出数组a的饮用="+a);
        System.out.println("输出数组b的饮用="+b);
        System.out.println("输出数组c的饮用="+c);
        System.out.println(c);
        System.out.println("a==b的结果是"+(a==b));
        a=b ;
        System.out.println("输出数组a的元素个数="+a.length);
        System.out.println("输出数组b的元素个数="+b.length);
        System.out.println("a==b的结果是"+(a==b));
        for (int i = 0; i < a.length; i++) {
            int x = 0 ;
            x = a[i] ;
            System.out.println("a的遍历结果"+x);
        }
        for (int i = 0; i < b.length; i++) {
            int x = 0 ;
            x = b[i] ;
            System.out.println("b的遍历结果"+x);
        }
    }
}
