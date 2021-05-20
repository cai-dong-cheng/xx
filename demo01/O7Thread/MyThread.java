package com.javabase.example.demo01.O7Thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i); 
        }
    }
}
