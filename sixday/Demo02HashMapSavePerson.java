package com.javabase.example.sixday;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02HashMapSavePerson {
    public static void main(String[] args) {
//        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person,String> map = new HashMap<>() ;
        map.put(new Person("女王",19),"英国");
        map.put(new Person("女王",19),"毛里求斯");
        map.put(new Person("秦始皇",22),"中国");
        map.put(new Person("普京",22),"俄罗斯");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        Iterator<Map.Entry<Person, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Person, String> entry = it.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }

    private static void show01() {
        HashMap<String,Person> map = new HashMap<>() ;
        map.put("北京",new Person("张三",22));
        map.put("上海",new Person("李四",19));
        map.put("北京",new Person("赵六",18));
        map.put("广州",new Person("王五",22));
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"="+value);
        }

    }
}
