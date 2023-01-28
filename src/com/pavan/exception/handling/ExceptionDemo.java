package com.pavan.exception.handling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        System.out.println("Program is in progress..");
        /*//example1
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        System.out.println(100/num);*/ // ArithmeticException

        //example2

        /*int[] a=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        System.out.println("Enter position 0-4");
        int pos=input.nextInt();
        a[pos]=num;

        System.out.println(a[pos]);*/// ArrayIndexOutOfBoundException

        //example3
        String s="welcome";
        int num=Integer.parseInt(s);
        System.out.println(num);//NumberFormatException


        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
