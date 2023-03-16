package YouTube;

import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter String");
        String str=input.nextLine();

        String str1=str.toLowerCase().replace(" ","").replaceAll("[^A-Za-z0-9]","");

        String rev=new StringBuilder(str1).reverse().toString();
        if(str1.equals(rev)){
            System.out.println(rev+" Is palindrome");
        }else{
            System.out.println(rev+" Is NOT palindrome");
        }


    }
}
