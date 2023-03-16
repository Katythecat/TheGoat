package com.pavan.Arrays;

public class Sum2D {
    public static void main(String[] args) {
        int[][] num={{2,4,6,8,10},{1,3,5,7,9},{9,5,4,2,8}};
        int sum=0;
        for(int[] a:num){
            for(int b:a){
                sum+=b;
            }
        }
        System.out.println(sum);

        //sum even odd
        int[][] num1={{2,4,6,8,10},{1,3,5,7,9},{9,5,4,2,8}};
        int sumEven=0;
        int sumOdd=0;
        for(int[]a:num1){
            for(int b:a){
                if(b%2==0){
                    sumEven+=b;
                }else{
                    sumOdd+=b;
                }
            }
        }
        System.out.println("Sum even "+ sumEven);
        System.out.println("Sum odd "+ sumOdd);

        //print odd
        int[][] num2={{2,4,6,8,10},{1,3,5,7,9},{9,5,4,2,8}};

        for(int[] a:num2){
            for(int b:a){
                if(b%2!=0){
                    System.out.println(b);
                }
            }
        }




    }



}
