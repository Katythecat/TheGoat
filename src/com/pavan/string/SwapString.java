package com.pavan.string;

public class SwapString {
    public static void main(String[] args) {
        String a="I love Somtam";
        String b="I am a SDET";

        a=a+b;//I love Somtam I am a SDET
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a+" and "+b);

    }
}
