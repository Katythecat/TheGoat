package com.pavan.Arrays;

public class OddEvenArray {
    public static void main(String[] args) {
        //how many even and odd in this array
        int[] num={2,13,5,7,16,12,8,4};
        int odd=0;
        int even=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of even is "+even);
        System.out.println("Number of odd is "+odd);

        //sum of array
        int[] number={2,4,6,43,5,1,67,8};
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        System.out.println("Sum of this array "+sum);


        // sum of even and odd
        int[] a={23,4,2,1,5,7,9,13,12,16};
        int sumEven=0;
        int sumOdd=0;
        for (int j : a) {
            if (j % 2 == 0) {
                sumEven += j;
            } else {
                sumOdd += j;
            }

        }
        System.out.println("sum even "+sumEven);
        System.out.println("sum odd "+sumOdd);

        //min max
        int[] aa={23,4,2,1,5,7,9,13,12,16};
        int min=aa[0];
        int max=aa[0];

        for (int i = 0; i < aa.length; i++) {
            if(aa[i]>max){
                max=aa[i];
            }else if (aa[i]<min){
                min=aa[i];
            }
        }
        System.out.println("Max "+max);
        System.out.println("Min "+min);


    }
}
