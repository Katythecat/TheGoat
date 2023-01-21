package com.pavan.array;

public class SumArray {
    public static void main(String[] args) {
        //find sum of elements in array
        int[] a={8,2,3,7,15,5};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
