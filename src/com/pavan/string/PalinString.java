package com.pavan.string;

public class PalinString {
    public static void main(String[] args) {

        String s="Do geese see God?";
        String a=s.replace(" ","").toLowerCase().replaceAll("[^a-z]","");
        String sb=new StringBuilder(a).reverse().toString();

        if(a.equals(sb)){
            System.out.println(a+" This is palindrome");
        }else{
            System.out.println(a+" This is NOT palindrome");
        }
    }
}
