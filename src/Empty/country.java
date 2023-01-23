package Empty;

import java.util.Scanner;

public class country {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countries = new String[5];
        //String[] capitals = new String[2];
        for (int i = 0; i < countries.length; i++) {
            //for (int j = 0; j < capitals.length; j++) {
                System.out.println("Please enter countries");
                countries[i] = input.next();
                System.out.println("Please enter its capital city");
                String capitals = input.next();
                System.out.println("The capital city of " + countries[i] + " is " + capitals);
            }

        }

    }

