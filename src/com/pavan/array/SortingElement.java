package com.pavan.array;

import java.util.Arrays;

public class SortingElement {
    public static void main(String[] args) {
        int[] arr = {32, 11, 5, 2, 15, 86, 4};
        //System.out.println("Element before sorting " + Arrays.toString(arr));
        int size=arr.length;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //when it's true it will swap numbers
                    //with 3 lines below *REMEMBER*
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //System.out.println("Element after sorting "+Arrays.toString(arr));
        System.out.println("Second Largest number is " + arr[size-2]);
       // System.out.println("After soring element");
      //  for (int i = 0; i < size; i++) {
         //   System.out.print(arr[i]+" ");
        }
       // System.out.println();
       // System.out.println("Second Largest number is " + arr[size-2]);



        }


