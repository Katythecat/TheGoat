package com.pavan.Arrays;

public class SecondLargestSort {
    public static void main(String[] args) {
        int[] num={1,5,6,9,34,87};
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
            System.out.println("After sorting element");
            for(int s:num){
                System.out.print(s+" ");
            }

        System.out.println("The second largest number is "+ num[num.length-2]);

        }
    }

