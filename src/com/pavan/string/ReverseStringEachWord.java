package com.pavan.string;

public class ReverseStringEachWord {
    public static void main(String[] args) {
        /*String str="Welcome to Java";
        String[] words=str.split(" ");

        String reverseString="";
        for (String w:words) {//we use for each loop bc we want to read String in each word in array
            String reverseWord="";
            for (int j = w.length()-1;j>=0;j--) {
                reverseWord=reverseWord+w.charAt(j);
            }
            reverseString=reverseString+reverseWord+" ";
        }
        System.out.println(reverseString);*/

        String str="Welcome to Selenium";
        String[] words=str.split(" ");

        String reverseWord="";
        for(String x:words){
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            reverseWord=reverseWord+sb.toString()+" ";
        }
        System.out.println(reverseWord);

    }
}
