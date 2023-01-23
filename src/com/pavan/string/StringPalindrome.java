package com.pavan.string;

public class StringPalindrome {
    public static void main(String[] args) {
        String s="madam";
        String emp="";

        for (int i = s.length()-1; i >=0; i--) {
            emp=emp+s.charAt(i);
        }
            if(emp.equals(s)){
                System.out.println("This is palindrome "+emp);
            }else{
                System.out.println("This is NOT palindrome "+emp);

        }

    }
}
