package com.pavan.string;

public class StringSwap {
    public static void main(String[] args) {

       String a="java";
       String b="selenium";
        System.out.println("Before swapping string a is "+a+" and b is "+ b);
       a=a+b;
       b=a.substring(0,a.length()-b.length());
       a=a.substring(b.length());
        System.out.println("Before swapping string a is "+a+" and b is "+ b);
    }
}
