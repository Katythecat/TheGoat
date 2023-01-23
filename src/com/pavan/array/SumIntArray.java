package com.pavan.array;

public class SumIntArray {
    public static void main(String[] args) {
        int[] arr={2,8,5,7,3,10};
        int sum=0;

        for(int x:arr){
            sum+=x;
        }
        System.out.println("Sum of element in array "+sum );

        int sum1=0;
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i];
        }
        System.out.println("Sum "+sum1);
    }

}
