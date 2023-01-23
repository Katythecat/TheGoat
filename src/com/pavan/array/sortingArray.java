package com.pavan.array;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        int[] arr = {1, 34, 5, 14, 32, 12, 15};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println("Element after sorting "+ Arrays.toString(arr));
        System.out.println("The second largest number is "+arr[arr.length-2]);
        }
    }
