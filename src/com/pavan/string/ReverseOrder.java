package com.pavan.string;

public class ReverseOrder {
    public static void main(String[] args) {
        String str="Sunday";
        /*String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);*/

        /*for (int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));*/

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("The reverse string is:"+rev);

    }
}
