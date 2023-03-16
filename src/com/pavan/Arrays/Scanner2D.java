package com.pavan.Arrays;

import java.util.Scanner;

public class Scanner2D {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter row and column of array");
        int r=input.nextInt();
        int c=input.nextInt();

        int[][] arr=new int[r][c];
        int sum=0;
        System.out.println("Enter number in 2d array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
