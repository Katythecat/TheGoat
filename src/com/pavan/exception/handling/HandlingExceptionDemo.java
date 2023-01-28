package com.pavan.exception.handling;

import java.util.Scanner;

public class HandlingExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        System.out.println("Program is in progress..");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        try {
            System.out.println(100 / num);// ArithmeticException
        }

        //if the statement trowing the exception catch block will handle the exception
        catch(ArithmeticException e){ // e is name we can give any name
            //e.printStackTrace();//if use this you will show what is error msg.to the user
            System.out.println(e.getMessage());//-- > show this message / by zero
            System.out.println("You have entered invalid input.");

        }
        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
