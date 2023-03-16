package com.pavan.string;

public class WordEachRev {
    public static void main(String[] args) {
        String a="Katy always gets what ever she wants";
        String[] arr=a.split(" ");
        String reverseWord;
        String revv="";
        for(String rev:arr){
            reverseWord=new StringBuilder(rev).reverse().toString()+" ";
            revv=revv+reverseWord;
        }
        System.out.println(revv);

    }
}
