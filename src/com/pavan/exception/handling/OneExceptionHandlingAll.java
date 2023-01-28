package com.pavan.exception.handling;

import java.util.Scanner;

public class OneExceptionHandlingAll {
    public static void main(String[] args) {

        System.out.println("Program is started...");
        System.out.println("Program is in progress..");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        String s=null;

        try{
            System.out.println(100/num);
           // System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("Exception throw");

        }
        System.out.println("Program is completed..");
        System.out.println("Program is exited..");

    }
}
