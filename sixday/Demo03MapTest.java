package com.javabase.example.sixday;

import java.util.HashMap;
import java.util.Scanner;

public class Demo03MapTest {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                map.put(c,1);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

}
