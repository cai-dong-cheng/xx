package com.javabase.example.fourday;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo01DoDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠", "红桃", "♦", "♣"};
        String[] numbers = {"2", "k", "q", "j", "10", "9", "8", "7", "6", "5", "4", "3","A"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        //
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                player01.add(p) ;
            }else if (i%3==1){
                player02.add(p) ;
            }else if (i%3==2){
                player03.add(p) ;
            }
        }
        System.out.println("玩家一"+player01);
        System.out.println("玩家二"+player02);
        System.out.println("玩家三"+player03);
        System.out.println("底牌"+diPai);


    }
}
