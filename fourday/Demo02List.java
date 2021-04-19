package com.javabase.example.fourday;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        list.add(3, "thematic");
        System.out.println(list);
        String remove = list.remove(2);
        System.out.println("被移除的元素"+remove);
        System.out.println(list);
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是"+setE);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("----------------");
        Iterator<String> it = list.iterator();
       while (it.hasNext()){
            String s= it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);
        }


    }
}
