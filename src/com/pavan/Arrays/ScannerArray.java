package com.pavan.Arrays;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array size");
        int num=input.nextInt();

        int[] a =new int[num];
        int sum=0;
        System.out.println("enter number to store in array");
        for (int i = 0; i <a.length; i++) {
            a[i]=input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
