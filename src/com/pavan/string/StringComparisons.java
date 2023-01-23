package com.pavan.string;

public class StringComparisons {
    public static void main(String[] args) {
        //String s1="welcome";
       // String s2="welcome";


        //case 1
       /* String s1="welcome";
        String s2="welcome";
        System.out.println(s1==s2);// true
        System.out.println(s1.equals(s2)); //true*/

        //case 2

        /*String s1=new String("welcome");
        String s2=new String("welcome");
        //if we create an object
        System.out.println(s1==s2);// false //compare objects (s1 and s2 name s1 and s2 not equals)
        System.out.println(s1.equals(s2)); //true //compare value of objects (welcome and welcome)*/

        //case 3
        String s1="abc";
        String s2=new String("abc");
        String s3=s2;

        System.out.println(s1);//abc
        System.out.println(s2);//abc
        System.out.println(s3);//abc

        System.out.println(s1==s2);// false
        System.out.println(s1.equals(s2));//true

        System.out.println(s2==s3);// true
        System.out.println(s2.equals(s3));//true

        //case4

         s1="abc";
         s2=new String("abc");
         s3=s2;

        System.out.println(s1==s3);//false
        System.out.println(s2==s3);//true
        System.out.println(s1.equals(s2));//true







    }
}
