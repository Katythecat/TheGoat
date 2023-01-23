package com.pavan.array;

public class PrintEven {
    public static void main(String[] args) {
        int[][] num={{2,43,12,65},
                    {32,33,11,14,15,71},
                     {1,3,5,6,9},
                     {3,5,7,4,6,2,8}
                    };

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
