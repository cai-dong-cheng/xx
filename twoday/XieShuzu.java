package com.javabase.example.twoday;

public class XieShuzu {
    public static void main(String[] args) {
        int [] myArry = {10,20,30,40} ;
        System.out.println(myArry[1]);
        int i = 5 , b = 5 ;
        System.out.println((i--)*(++b));
        String s = "Test" ;
        switch (s){
            case "Test" :
                System.out.println(s);
                break;
        }
    }
}
