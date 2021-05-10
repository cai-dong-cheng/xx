package com.javabase.example.demo01.Thread.Threadpoor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(new RunnableImpl());
        ex.submit(new RunnableImpl());

    }
}
