package Empty;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter numbers");
        int num=input.nextInt();
        int count=0;

        for (int i = 1; i <=num ; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("This is prime numbers "+num);
        }else{
            System.out.println("This is NOT prime numbers "+num);
        }
    }
}
