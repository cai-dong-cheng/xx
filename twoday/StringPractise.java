package com.javabase.example.twoday;

public class StringPractise {
    public static void main(String[] args) {
        int [] t = {1, 2, 3} ;
        String sr =StringPractise.fromArrayToString(t) ;
        System.out.println(sr);
    }
    public static String fromArrayToString(int [] t){
        String str = "[";
        for (int i = 0; i < t.length; i++) {
            if (i == t.length-1){
                str += "word" + t[i] +"]" ;
            }else
            str += "word" + t[i] + "#" ;
        }
        return str ;
    }
 }
