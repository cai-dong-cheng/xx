package com.javabase.example.demo01.O7Thread.Lambda;

public class Demo01CookLamba {
    public static void main(String[] args) {
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
    }
        public static void invokeCook (Cook cook){
            cook.makeFood();
        }
}

