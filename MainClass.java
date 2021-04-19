package com.javabase.example;
import static java.lang.Math.PI;
public class MainClass {
    public static void main(String[] args) {
        Cricle cricle = new Cricle() ;
        cricle.printArea(100);
        Rectangle rectangle = new Rectangle() ;
        rectangle.printArea(100,200);
    }
}
class Cricle {
    void printArea(double r){
        System.out.println(r*r*PI);
    }
}
class Rectangle{
    void printArea(double a, double b){
        System.out.println(a*b);
    }
}