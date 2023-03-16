package com.pavan.string;

public class WordByWordString {
    public static void main(String[] args) {
        String str="Today is cold";
        String[] arr=str.split(" ");
        String rev="";
        for(String s: arr){
            rev=new StringBuilder(s).reverse()+" ";
            System.out.print(rev);
        }

    }
}
