package com.javabase.example.demo01.Thread;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (i < 5) {
                    synchronized (obj) {
                        System.out.println("包子的数量和种类");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开始吃包子");
                        System.out.println("=========");
                        i++;
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                int i = 0;
                while (i < 5) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("包子已经做好了");
                        obj.notify();
                    }

                }
            }
        }.start();
    }
}