package com.javabase.example;
/*
矩形面积
public类要与文件名相同
 */
public class Rect {
   double width ;
   double height ;
   double getArea(){
       return width*height ;
   }
}
class Example1_2{
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.width = 1.22 ;
        rect.height = 1.56 ;
        double area = rect.getArea() ;
        System.out.println(area);
    }
}