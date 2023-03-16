package com.pavan.Arrays;

public class SearchEle {
    public static void main(String[] args) {
        int[] num={3,5,6,1,7,43,7,44};
        int exp=55;
        boolean flag=false;
        for(int s:num){
            if(s==exp){
                System.out.println("Found element");
                flag=true;
            }
        }if(flag==false){
            System.out.println("Element not found");
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i]==exp){
                System.out.println("Found array at index "+i);
            }

        }
    }
}
