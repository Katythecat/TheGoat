package com.pavan.string;

public class StrSwap {
    public static void main(String[] args) {
        String a="Leo";
        String b="Nala";
        System.out.println("Before swapping string a is "+a+" b is "+b);

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("Before swapping string a is "+a+" b is "+b);
    }
}
