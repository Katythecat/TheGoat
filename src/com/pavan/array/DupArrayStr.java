package com.pavan.array;

public class DupArrayStr {
    public static void main(String[] args) {
        String[] str={"Monday","Food","Food","monday"};
        boolean flag=false;
        for(int i =0; i<str.length;i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println("This element has duplicate string"+str[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("No duplicate string");
        }


        }
    }

