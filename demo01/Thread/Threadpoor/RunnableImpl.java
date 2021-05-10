package com.javabase.example.demo01.Thread.Threadpoor;

public class RunnableImpl extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个线程");
    }
}
