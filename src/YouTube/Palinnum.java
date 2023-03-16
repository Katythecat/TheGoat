package YouTube;

import java.util.Scanner;

public class Palinnum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        int emp=num;
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;

        }if(rev==emp){
            System.out.println(rev+" Is palindrome");
        }else{
            System.out.println(rev+ " Is NOT palindrome");
        }
    }
}
