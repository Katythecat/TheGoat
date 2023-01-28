package com.pavan.exception.handling;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        System.out.println("Program is in progress..");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        //we can have multiple catch block in one try if we don't know exception type of
        //exception we will get

        String s=null;


        try {
            //System.out.println(100 / num);
            System.out.println(s.length());
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException throw");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException throw");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException throw");
        }
        System.out.println("Program is completed..");
        System.out.println("Program is exited..");
    }
}
