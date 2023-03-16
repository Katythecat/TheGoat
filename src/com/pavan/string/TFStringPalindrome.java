package com.pavan.string;

public class TFStringPalindrome {
    public static void main(String[] args) {
        String s="Dammit, I'm mad!";
        String n=s.toLowerCase().replace(" ","").replaceAll("[^A-za-z0-9]","");
        String rev=new StringBuilder(n).reverse().toString();
        if(rev.equals(n)){
            System.out.println(n+" Is palindrome");

        }else{
            System.out.println(n+" Is NOT palindrome");
        }


    }
}
