package Empty;

import java.util.Scanner;

public class Primemy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }else{
            flag=false;//this else is not necessary
        }
            System.out.println(num + " is prime? " + flag);
        }
    }

