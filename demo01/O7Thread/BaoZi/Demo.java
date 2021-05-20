package com.javabase.example.demo01.O7Thread.BaoZi;

public class Demo {
    public static void main(String[] args) {
        Baozi bz =new Baozi();
        new BaoziPu(bz).start();
        new ChiHuo(bz).start();
    }
}
