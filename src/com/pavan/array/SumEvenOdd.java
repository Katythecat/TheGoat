package com.pavan.array;

public class SumEvenOdd {
    public static void main(String[] args) {
        int[][] numbers={{2,4,64,12,43},
                {3,45,76,12,43,76},
                {7,3,9,2,5,6}};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
                }else if(numbers[i][j]%2!=0){
                    sumOdd+=numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is:"+sumEven);
        System.out.println("Sum of odd numbers is:"+sumOdd);


        int sumEven1=0;
        int sumOdd1=0;

        for (int[] x:numbers){
            for(int y:x){
                if(y%2==0){
                    sumEven1+=y;
                }else if(y%2!=0){
                    sumOdd1+=y;
                }
            }

        }
        System.out.println(sumEven1);
        System.out.println(sumOdd1);
    }
}
