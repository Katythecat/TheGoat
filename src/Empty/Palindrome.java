package Empty;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your string");
        String str=input.next();

        String emp="";
        for (int i=str.length()-1;i>=0;i--){
            emp=emp+str.charAt(i);
        }
        if(emp.equals(str)){
            System.out.println("This is palindrome "+emp);
        }else{
            System.out.println("This is NOT palindrome "+emp);
        }
    }
}
