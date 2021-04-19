package com.javabase.example.twoday;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("请输入一个字符串");
        String str =  scanner.next() ;
        int countNumber = 0 ;
        int countOther = 0 ;
        int countBig = 0 ;
        int countSmall = 0 ;
        char [] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i] ;
            if ('A'<=ch && ch<='Z'){
                countBig++ ;
            }else if ('a'<=ch && ch<='z'){
                countSmall++ ;
            }else if ('0'<=ch && ch<='9'){
                countNumber++;
            }else {
                countOther++ ;
            }
        }
        System.out.println("大写字母的个数"+ countBig);
        System.out.println("小写字母的个数"+countSmall);
        System.out.println("数字的个数"+countNumber);
        System.out.println("其他字符的个数"+countOther);
    }
}
