package com.pavan.string;

public class LongWayEachWord {
    public static void main(String[] args) {
        String a="I am hungry";
        String[] arr=a.split(" ");
        String rev="";
        for (int i = 0; i < arr.length; i++) {
            String revv=arr[i];
            String revWord="";

            for (int j = revv.length()-1; j >=0 ; j--) {
                revWord=revWord+revv.charAt(j);
            }
            rev=rev+revWord+" ";
        }
        System.out.println(rev);
    }
}
