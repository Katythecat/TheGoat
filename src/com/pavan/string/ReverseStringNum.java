package com.pavan.string;

public class ReverseStringNum {
    public static void main(String[] args) {
        int[] num = {53, 2, 1, 6, 8, 9, 3, 4};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
