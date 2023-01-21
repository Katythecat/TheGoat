package com.pavan.array;

public class EvenOdd {
    public static void main(String[] args) {
        //print even and odd in Array
        int[] num={1,2,3,4,5,6,7,8};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                sumEven+=num[i];
            }if(num[i]%2!=0){
                sumOdd+=num[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
