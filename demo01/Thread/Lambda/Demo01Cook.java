package com.javabase.example.demo01.Thread.Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
     invokeCook(new Cook() {
         @Override
         public void makeFood() {
             System.out.println("吃饭了");
         }
     });
    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
