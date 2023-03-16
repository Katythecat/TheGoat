package com.pavan.Arrays;

public class DupString {
    public static void main(String[] args) {
        String[] s={"cat","dog","bat","cat","flower","food"};
        boolean flag=false;
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j <s.length ; j++) {
                if(s[i].equalsIgnoreCase(s[j])){
                    System.out.println("Duplicate String is "+s[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("Do not have duplicate string");
        }
    }
}
