package com.pavan.string;

public class StringPrintEven {
    public static void main(String[] args) {
        int[][] arr={{12,4,14,77},{8,7,2,3,},{14,3,9,11}};
        for(int[] a:arr){
            for(int s:a){
                if(s%2==0){
                    System.out.print(s+" ");
                }
            }
        }
    }
}
