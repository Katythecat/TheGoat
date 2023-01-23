package com.pavan.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Thailand";
        String rev = " ";

       /* System.out.println("String before reverse "+s);
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
            }
        System.out.println("String after reverse "+rev);
        }*/

       /* // 2 using character array / charAt and String and Array start from index 0
        char a[]=s.toCharArray();
        for (int i = a.length-1; i >=0; i--) {
            rev=rev+a[i];
        }
        System.out.println("Reverse string is"+rev);
    }*/

        //3 using string buffer class
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());





    }



    }

