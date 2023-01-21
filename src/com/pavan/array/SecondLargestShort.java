package com.pavan.array;

import java.util.Arrays;

public class SecondLargestShort {
    public static void main(String[] args) {
        int[] arr={2,5,23,64,13,65};
        int largest=0;
        int secondLargest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("We want see the element of arr:"+Arrays.toString(arr));
        System.out.println("The second largest of array is:"+secondLargest);
    }
}
