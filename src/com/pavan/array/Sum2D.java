package com.pavan.array;

public class Sum2D {
    public static void main(String[] args) {
        int[][] arr={{23,17,5,12},
                     {5,7,3,8,2,5},
                     {9,11,3,17,20,1,1,1}
                     };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of 2d: "+sum);

        int sum1=0;
        for (int[]x:arr){
            for(int y:x){
                sum1+=y;
            }
            }
        System.out.println(sum1);
        }
    }

