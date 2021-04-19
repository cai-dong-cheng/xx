package com.javabase.example.threeday;

import java.util.Arrays;

public class Demo02System {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }

    private static void demo02() {
        int[] src = {1,2,3,4,5} ;
        int[] dest ={6,7,8,9,10} ;
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }

    private static void demo01() {
        long first = System.currentTimeMillis();
        for (int i = 1; i <9999 ; i++) {
            System.out.println(i);

        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时"+(end-first)+"毫秒");
    }
}
