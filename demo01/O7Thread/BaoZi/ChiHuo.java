package com.javabase.example.demo01.O7Thread.BaoZi;

public class ChiHuo extends Thread {
    private Baozi bz;

    public ChiHuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int number = 0;
        while (number < 5) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货吃"+bz.pi+bz.xian+"包子");
                bz.flag =false;
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"包子吃完了");
                System.out.println("==========");
            }
            number ++;
        }

    }
}
