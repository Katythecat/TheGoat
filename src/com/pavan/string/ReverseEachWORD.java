package com.pavan.string;

public class ReverseEachWORD {
    public static void main(String[] args) {


        String str = "I want to cook Thai food rn";
        String[] strs = str.split(" ");
        //for (int i = 0; i <strs.length ; i++) {
           // System.out.print(strs[i]+" ");
        //}
       // System.out.println();
        for(String x:strs){
            String rev=new StringBuilder(x).reverse().toString();
            System.out.print(rev+" ");
        }

        }



    }


