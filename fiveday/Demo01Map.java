package com.javabase.example.fiveday;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }

    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("灵灵",18);
        map.put("卡卡",16);
        map.put("九九",32);
        boolean v1 = map.containsKey("九九");
        System.out.println("v1:"+v1);
        boolean v2 = map.containsKey("ww");
        System.out.println("v2:"+v2);
    }

    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("灵灵",18);
        map.put("卡卡",16);
        map.put("九九",32);
        Integer v1 = map.get("九九");
        System.out.println(v1);
        Integer v2 = map.get("毛毛");
        System.out.println(v2);
    }

    private static void show02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("灵灵",18);
        map.put("卡卡",16);
        map.put("九九",32);
        System.out.println(map);
        Integer i = map.remove("卡卡");
        System.out.println("被删除的是："+i);
        System.out.println(map);
        Integer v2 = map.remove("毛毛");
        System.out.println(v2);

    }

    private static void show01() {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("英雄", "英语");
        System.out.println("v1:"+v1);
        String v2 = map.put("英雄", "联盟");
        System.out.println("v2"+v2);
        map.put("零零","一一");
        System.out.println(map );

    }

}
