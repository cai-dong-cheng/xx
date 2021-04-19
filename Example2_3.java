package com.javabase.example;
/*

 */
import java.util.Scanner;

public class Example2_3 {
    public static void main(String[] args) {
        System.out.println("用空格（或回车）做分割，输入若干个数，最后输入#结束，\n然后回车确认");
        Scanner scanner = new Scanner(System.in);
        double sum = 0 ;
        int m = 0 ;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1 ;
            sum = sum + x ;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均数为"+sum/m);
    }
}
