package com.pavan.exception.handling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        System.out.println("Program is in progress..");

        String s=null;
        try {
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("Exception occurred.. handled");
        }
        finally{//we can't put multiple finally
            System.out.println("Enter the finally block");
        }
        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
