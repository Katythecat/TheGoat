package com.pavan.array;

import java.util.Arrays;

public class TheSecondLargestNum {
    public static void main(String[] args) {
        int[] num={5,3,1,4,2};
        int temp;
        for (int i = 0; i <num.length; i++) {
            for (int j=i+1; j <num.length ; j++) {
                if (num[i] > num[j]) {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("After sorting element");
        for (int n:num) {
            System.out.print(n+" ");
       }
        System.out.println();
        //System.out.println("The second largest numbers is "+num[num.length-2]);
       //System.out.println("After we are sorting element"+ Arrays.toString(num));
        //System.out.println("The second largest number is "+num[size-2]);
        System.out.println("The second largest number is "+num[num.length-2]);


    }
}
