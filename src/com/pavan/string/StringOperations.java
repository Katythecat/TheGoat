package com.pavan.string;

public class StringOperations {
    public static void main(String[] args) {
        String s="welcome";
      //  String s=new String("welcome");
        System.out.println(s);

        //length of a string
        System.out.println(s.length());// 7 total number of characters

        //concat() - joining strings

        String s1="welcome";
        String s2="to java";
        String s3="automation";

        System.out.println(s1+s2);// welcometo java
        System.out.println(s1.concat(s2)); //welcometo java

        System.out.println(s1+s2+s3);//welcometo javaautomation
        System.out.println(s1.concat(s2).concat(s3));//welcometo javaautomation

        //trim - remove right and left spaces
        s="   automation     ";

        //String res=s.trim();//1
        //System.out.println(res);//2
        System.out.println(s.length()); // 18
        System.out.println(s.trim());//automation
        System.out.println(s.trim().length());//10

        //charAt() - returns a single char based on index we passed
        //index count starts from zero

        s="welcome";
        System.out.println(s.charAt(0));//w
        System.out.println(s.charAt(3));//c

        //contains() - returns boolean true/false

        System.out.println(s.contains("wel"));//true
        System.out.println(s.contains("come"));//true
        System.out.println(s.contains("Wel"));//false

        //equals() , equalsIgnoreCase() - compare two strings
        //returns boolean value

        s1="WELCOME";
        s2="welcome";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));// true

        //replace - replace single/multiple characters in a string
        s="welcome to selenium automation testing selenium training";
        System.out.println(s.replace('e','$'));
        //w$lcom$ to s$l$nium automation t$sting s$l$nium training

        System.out.println(s.replace("selenium","java"));
        //welcome to java automation testing java training

        //substring() - to extract substring from the main string
        s="welcome";
        System.out.println(s.substring(2,5));//lco
        System.out.println(s.substring(0,6));//welcom

        //split() - divide the string into multiple parts using delimiter
        //should not use * $ ^ ? . + -
        s="abc@gmail.com";
       String a[]=s.split("@");

        System.out.println(a[0]);//abc
        System.out.println(a[1]);//gmail.com

      //  String b[]=s.split("."); cannot use . for delimiter

        //toUpperCase(), toLowerCase()
        s="welCOMe";
        System.out.println(s.toLowerCase());//welcome
        System.out.println(s.toUpperCase());//WELCOME






    }
}
