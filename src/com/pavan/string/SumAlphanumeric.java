package com.pavan.string;

public class SumAlphanumeric {
    public static void main(String[] args) {
        String str="hkJEH^Wv157oihrgro1324635%@^%^!%";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());


    }
}
