package com.pavan.array;

public class SecondL {
    public static void main(String[] args) {
        int[] arr={54,22,6,14,55,1,65,33,4,};
        int largest=0;
        int secondLargest=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }

        }
        System.out.println("The second largest number is "+secondLargest);

    }

}
