package com.javabase.example.demo01.Thread.Lambda;

public class Demo02InvokeCalcLamba {
    public static void main(String[] args) {
        invokeCalc(30,40,(int a,int b)->{return a+b;});
    }
    private static void invokeCalc(int a,int b,Calculator c){
        int result = c.calc(a,b);
        System.out.println("结果是："+result);
    }
}
