package com.pavan.array;

public class SearchElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 11, 3, 7, 96, 14};
        int search = 2;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.println("Element found at index " + i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Element not found");

        }

    }
}

