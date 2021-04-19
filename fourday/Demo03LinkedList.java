package com.javabase.example.fourday;

import java.util.LinkedList;
import java.util.List;

public class Demo03LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.addFirst("WWW");
        list.push("www.");
        list.addLast("com");
        System.out.println(list);
        if (!list.isEmpty()){
            String first = list.getFirst();
            String last = list.getLast();
            System.out.println(first);
            System.out.println(last);
            String f = list.removeFirst();
            String last1 = list.removeLast();
            String pop = list.pop();
            System.out.println(list );
        }
    }
}
