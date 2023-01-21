package com.pavan.array;

public class DuplicateArrayString {
    public static void main(String[] args) {
        String[] arr = {"Leo", "Mama", "blue", "Pink", "Vanilla", "Blue","pink"};
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("The duplicate element is "+arr[i]);
                    flag=true;
                }
            }
        }
        if(!flag){
            System.out.println("Duplicate NOT found");
        }

    }
}
