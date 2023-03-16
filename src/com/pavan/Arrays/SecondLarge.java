package com.pavan.Arrays;

public class SecondLarge {
    public static void main(String[] args) {
        int[] num={43,12,33,76,12,5,76,87};
        int large=0;
        int secondLarge=0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]>large) {
                secondLarge=large;
                large=num[i];

            }else if(num[i]>secondLarge){
                secondLarge=num[i];
            }
        }
        System.out.println("The largest number is "+ large);
        System.out.println("Second largest number is "+ secondLarge);

        }
    }

