package com.javabase.example.fourday;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo04Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>() ;
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(2);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
