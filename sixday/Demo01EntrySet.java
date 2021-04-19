package com.javabase.example.sixday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("灵灵",18);
        map.put("卡卡",16);
        map.put("九九",32);
        Set<Map.Entry<String, Integer>> set  = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("===============");
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
