package com.javabase.example.demo01.O7Thread.BaoZi;

public class BaoziPu extends Thread {
    private Baozi bz;

    public BaoziPu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        int numer = 0;
        while (numer < 5) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉馅";
                }
                count++;
                numer++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺生产好了" + bz.pi + bz.xian + "包子" + "让吃货线程来吃包子");
            }
        }
    }
}