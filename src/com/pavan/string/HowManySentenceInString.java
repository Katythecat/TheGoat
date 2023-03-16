package com.pavan.string;

public class HowManySentenceInString {
    public static void main(String[] args) {

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] arr=str.split("[?]");
        System.out.println(arr.length);

    }
}
