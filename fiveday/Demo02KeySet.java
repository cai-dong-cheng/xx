package com.javabase.example.fiveday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("明明",32);
        map.put("西西",38);
        map.put("琪琪",38);
        Set<String> set = map.keySet();
        Iterator<String> it= set.iterator();
        while (it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
            System.out.println("==========");
            for (String k : map.keySet()) {
                Integer v = map.get(k);
                System.out.println(k+"="+v);
                System.out.println("=========");
            }
        }
    }
}
