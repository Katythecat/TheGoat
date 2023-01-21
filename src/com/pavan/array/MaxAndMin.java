package com.pavan.array;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr={2,43,12,5,75,21,99};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }
}
