package com.pavan.array;

import java.util.Scanner;

public class Scanner2D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter row and column of 2d array ");
        int r=input.nextInt();
        int c=input.nextInt();
        int[][] arr=new int[r][c];
        int sum=0;

        System.out.println("Please enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();

        }
        System.out.println("Sum of element"+sum);

    }
}
