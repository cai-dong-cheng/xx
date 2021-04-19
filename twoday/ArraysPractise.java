package com.javabase.example.twoday;

import java.util.Arrays;

public class ArraysPractise {
    public static void main(String[] args) {
        String str = "ahfurcinrklowhrb" ;
         char[] chars = str.toCharArray() ;
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
