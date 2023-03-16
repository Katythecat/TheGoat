package com.pavan.string;

public class StringSumNum {
    public static void main(String[] args) {
        int[][] num={{15,25,14},{5,4,7},{9,17,3}};
        int SumNum=0;
        for(int[] n:num){
            for(int sum:n){
                SumNum+=sum;
            }
        }
        System.out.println(SumNum);
    }
}
