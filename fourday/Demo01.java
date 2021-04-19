package com.javabase.example.fourday;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>() ;
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"❤","♠","♦","♣"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color+number) ;
            }
        }
        Collections.shuffle(poker);
        ArrayList<String> player01 = new ArrayList<>() ;
        ArrayList<String> player02 = new ArrayList<>() ;
        ArrayList<String> player03 = new ArrayList<>() ;
        ArrayList<String> diPai = new ArrayList<>() ;
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                player01.add(p);
            } else if (i % 3 == 1) {
                player02.add(p);
            } else if (i % 3 == 2) {
                player03.add(p);
            }
        }
        System.out.println("玩家一"+player01);
        System.out.println(player01.size());
        System.out.println("玩家二"+player03);
        System.out.println(player02.size());
        System.out.println("玩家三"+player03);
        System.out.println(player03.size());
        System.out.println("底牌"+diPai);
    }
}
